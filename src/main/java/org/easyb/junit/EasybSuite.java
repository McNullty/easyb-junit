package org.easyb.junit;

import java.io.File;

import org.junit.runner.RunWith;

@RunWith(EasybJUnitRunner.class)
public abstract class EasybSuite {

    protected File baseDir() {
	return new File("spec");
    }

    protected String description() {
	return this.getClass().getName();
    }

    protected boolean generateReports() {
	return false;
    }

    protected File reportsDir() {
	return new File("reports");
    }

    protected File searchDir() {
	String path = this.getClass().getName();
	path = path.substring(0, path.lastIndexOf('.'));
	path = path.replace('.', '/');
	return new File(this.baseDir(), path);
    }

    protected boolean trackTime() {
	return false;
    }
}
