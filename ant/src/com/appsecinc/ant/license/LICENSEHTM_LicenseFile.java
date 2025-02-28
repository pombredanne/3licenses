/*******************************************************************************
* 3Licenses (http://3licenses.codeplex.com)
* 
* Copyright (c) 2010 Application Security, Inc.
* 
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*     Application Security, Inc.
*******************************************************************************/
package com.appsecinc.ant.license;

public class LICENSEHTM_LicenseFile implements LicenseFile {

	@Override
	public String getExtension() {
		return "html";
	}

	@Override
	public boolean isMatch(String filename) {
		String filenameLowerCase = filename.toLowerCase();
		return filenameLowerCase.equals("license.html")
			|| filenameLowerCase.equals("license.htm") 
			|| filenameLowerCase.endsWith("-license.htm")
			|| filenameLowerCase.endsWith("-license.html");
	}

	@Override
	public String getSpec(String filename) {
		String filenameLowerCase = filename.toLowerCase();
		filenameLowerCase = filenameLowerCase.replace(".html", "");
		filenameLowerCase = filenameLowerCase.replace(".htm", "");
		filenameLowerCase = filenameLowerCase.replace("-license", "");
		filenameLowerCase = filenameLowerCase.replace("_license", "");
		if (filenameLowerCase.equals("license")) return "";
		return filenameLowerCase;
	}
	
	@Override
	public String getType() {
		return null;
	}
}
