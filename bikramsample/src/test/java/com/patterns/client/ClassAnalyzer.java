package com.patterns.client;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

enum ClassMember {
	CONSTRUCTOR, FIELD, METHOD, CLASS, ALL
}

public class ClassAnalyzer {
	private static List<MethodObj> interfaceMethodList = new ArrayList<MethodObj>();
	private static List<MethodObj> classMethodList = new ArrayList<MethodObj>();

	public static void main(String... args) {
		FileWriter fOut = null;
		try {
			// File[] dirNames = {
			// new File(
			// "D:\\Design_Pattern\\Sample\\bikramsample\\target\\classes\\com\\patterns\\adaptor"),
			// new File(
			// "D:\\Design_Pattern\\Sample\\bikramsample\\target\\classes\\com\\patterns\\delegate")
			// };
			File dirNames[] = { new File(
					"D:\\LadBrokes\\EComm_Step_Change_Prog\\branches\\scrum_sprint6\\Code\\hybris\\bin\\custom\\ladbrokesplatform\\classes\\com\\ladbrokes\\core\\strategy") };
			fOut = new FileWriter("D:\\Ladbrokes\\interface_impl_diff_methods.csv", false);
			for (File dirName : dirNames) {
				File[] matches = dirName.listFiles(new FilenameFilter() {
					public boolean accept(File dir, String name) {
						return !name.contains("Test")
								&& name.endsWith(".class");
					}
				});
				int fileLength = matches.length;
				out.println("Number of files : " + fileLength);
				for (int itr2 = 0; itr2 < fileLength; itr2++) {
					try {
						File fileName = matches[itr2];
						// out.println("File name : " + fileName);
						int indexVal = fileName.getCanonicalPath().indexOf(
								"com");
						String fileNameObj = fileName.getCanonicalPath()
								.substring(indexVal);
						// out.println("fileNameObj : " + fileNameObj);
						fileNameObj = fileNameObj.replace('\\', '.');
						out.println("fileNameObj : " + fileNameObj);
						Class<?> classObj = Class.forName(fileNameObj
								.substring(0, fileNameObj.lastIndexOf('.')));
						String className = classObj.getName();
						out.println("Class name : " + className);
						String implClassName = findClass(className);
						out.println("implClassName : " + implClassName);
						String strArr[] = { className, "METHOD", implClassName,
								"METHOD" };
						processClassData(fOut, strArr);
					} catch (ClassNotFoundException cEx) {
						cEx.printStackTrace();
					}
				}
			}
			// production code should handle these exceptions more gracefully
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fOut != null) {
				try {
					fOut.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	// private static String findClass(String className) {
	// int lastIndex = className.lastIndexOf('.');
	// String newClassName = className.substring(lastIndex + 2);
	// out.println("newClassName : " + newClassName);
	// StringBuffer implClassNameBuff = new StringBuffer();
	// implClassNameBuff.append(className.substring(0, lastIndex));
	// implClassNameBuff.append(".impl.");
	// implClassNameBuff.append(newClassName);
	// return implClassNameBuff.toString();
	// }

	private static String findClass(String className) {
		int lastIndex = className.lastIndexOf('.');
		String newClassName = className.substring(lastIndex + 1);
		StringBuffer implClassNameBuff = new StringBuffer();
		implClassNameBuff.append(className.substring(0, lastIndex));
		implClassNameBuff.append(".impl.");
		implClassNameBuff.append(newClassName).append("Impl");
		out.println("implClassNameBuff : " + implClassNameBuff.toString());
		return implClassNameBuff.toString();
	}

	private static void printMembers(Member[] mbrs, String s, String typeData) {
		for (Member mbr : mbrs) {
			if (mbr instanceof Field) {
				out.format("  %s%n", ((Field) mbr).toGenericString());
			} else if (mbr instanceof Constructor) {
				// out.format("  %s%n", ((Constructor)mbr).toGenericString());
			} else if (mbr instanceof Method) {
				Class<?>[] paramTypes = ((Method) mbr).getParameterTypes();
				Class<?> returnType = ((Method) mbr).getReturnType();
				MethodObj mObj = new MethodObj((Method) mbr, paramTypes,
						returnType);
				String methodName = mObj.getMethodObj().toGenericString();
				out.println("methodName : " + methodName);
				int indexVal = methodName.indexOf("public");
				if (indexVal != -1) {
					if ("I".equalsIgnoreCase(typeData)) {
						out.println("For I");
						interfaceMethodList.add(mObj);
					}
					if ("C".equalsIgnoreCase(typeData)) {
						out.println("For C");
						classMethodList.add(mObj);
					}
				}
			}
		}
		if (mbrs.length == 0)
			out.format("  -- No %s --%n", s);
		out.format("%n");
	}

	private static void printClasses(Class<?> c) {
		out.format("Classes:%n");
		Class<?>[] clss = c.getClasses();
		for (Class<?> cls : clss)
			out.format("  %s%n", cls.getCanonicalName());
		if (clss.length == 0)
			out.format("  -- No member interfaces, classes, or enums --%n");
		out.format("%n");
	}

	private static void processClassData(FileWriter fOut, String... args) {
		// FileWriter fOut = null;
		try {
			Class<?> c = Class.forName(args[0]);
			out.format("Class:%n  %s%n%n", c.getCanonicalName());
			for (int i = 1; i < 2; i++) {
				switch (ClassMember.valueOf(args[i])) {
				case CONSTRUCTOR:
					// printMembers(c.getConstructors(), "Constructor");
					break;
				case FIELD:
					// printMembers(c.getFields(), "Fields");
					break;
				case METHOD:
					printMembers(c.getDeclaredMethods(), "Methods", "I");
					break;
				case CLASS:
					printClasses(c);
					break;
				case ALL:
					break;
				default:
					assert false;
				}
			}

			c = Class.forName(args[2]);
			// out.format("Class:%n  %s%n%n", c.getCanonicalName());

			for (int i = 3; i < args.length; i++) {
				switch (ClassMember.valueOf(args[i])) {
				case CONSTRUCTOR:
					// printMembers(c.getConstructors(), "Constructor");
					break;
				case FIELD:
					// printMembers(c.getFields(), "Fields");
					break;
				case METHOD:
					printMembers(c.getDeclaredMethods(), "Methods", "C");
					break;
				case CLASS:
					printClasses(c);
					break;
				case ALL:
					break;
				default:
					assert false;
				}
			}
			int listSize = classMethodList.size();
			out.println("listSize : " + listSize);
			for (MethodObj classMethod : classMethodList) {
				out.println("classMethod : "
						+ classMethod.getMethodObj().toGenericString());
				int listSizeData = interfaceMethodList.size();
				out.println("interfaceMethodList : " + listSizeData);
				int matchVal = -1;
				for (MethodObj classMethodData : interfaceMethodList) {
					out.println("classMethodData : "
							+ classMethodData.getMethodObj().toGenericString());
					if (classMethod.compareTo(classMethodData) == 0) {
						matchVal = 0;
					}
				}
				if (matchVal == -1) {
					out.println("There is mismatch between interface and class for the method : "
							+ classMethod.getMethodObj().toGenericString());
					fOut.write(c.getCanonicalName() + ","
							+ classMethod.getMethodObj().toGenericString()
							+ "\n");
				}
			}
			interfaceMethodList.clear();
			classMethodList.clear();
		} catch (IOException ioEx) {
			// Do Nothing now
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

@SuppressWarnings("rawtypes")
class MethodObj implements Comparable {
	private Class<?> returnType;
	private Method methodObj;

	public MethodObj(Method methodObj, Class<?>[] parameterTypes,
			Class<?> returnType) {
		super();
		this.methodObj = methodObj;
		// this.methodName = methodObj.
		this.parameterTypes = parameterTypes;
		this.returnType = returnType;
	}

	public Method getMethodObj() {
		return methodObj;
	}

	public void setMethodObj(Method methodObj) {
		this.methodObj = methodObj;
	}

	public Class<?>[] getParameterTypes() {
		return parameterTypes;
	}

	public void setParameterTypes(Class<?>[] parameterTypes) {
		this.parameterTypes = parameterTypes;
	}

	public Class<?> getReturnType() {
		return returnType;
	}

	public void setReturnTypes(Class<?> returnType) {
		this.returnType = returnType;
	}

	private Class<?>[] parameterTypes;

	public int compareTo(Object objTwo) {
		// TODO Auto-generated method stub
		MethodObj mObjTwo = (MethodObj) objTwo;
		int compareValue = -1;
		if (!this.getMethodObj().getName()
				.equals(mObjTwo.getMethodObj().getName())) {
			out.println("In 1");
			// compareValue = -1;
			return compareValue;
		}
		Class<?>[] parameterTypes = this.getParameterTypes();
		int paramLength = parameterTypes.length;
		out.println("paramLength : " + paramLength);
		if (paramLength != 0) {
			for (Class<?> paramType : parameterTypes) {
				Class<?>[] parameterTypesData = mObjTwo.getParameterTypes();
				// int paramLengthData = parameterTypesData.length;
				for (Class<?> paramTypeData : parameterTypesData) {
					out.println("paramTypeData : " + paramTypeData.getName());
					if (paramType.getName().equals(paramTypeData.getName())) {
						out.println("In 2");
						compareValue = 0;
						break;
					} else {
						compareValue = -1;
					}
				}
			}
		} else {
			compareValue = 0;
		}
		out.println("compareValue : " + compareValue);
		Class<?> returnType = this.getReturnType();
		Class<?> returnTypeData = mObjTwo.getReturnType();
		if (compareValue != -1 && !returnType.equals(returnTypeData)) {
			out.println("In 3");
			compareValue = -1;
		}
		return compareValue;
	}
}