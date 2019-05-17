package gui;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class MainApplicationIssueUTF8 {

	public static void main(String args[]) {
		File file = new File(".", "src/test/resources/issue-utf-8/STM32Conv-freeroute.dsn");
		String[] main_args = { "-debug", "-de", file.getAbsolutePath() };
		MainApplication.main(main_args);
	}

}
