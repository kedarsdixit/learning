package com.voda.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileIO {

	public List<String> getData(String filePath) throws FileNotFoundException {

		File file = new File(filePath);
		Scanner scanner = new Scanner(file);

		List<String> fileData = new ArrayList<String>();

		while (scanner.hasNext()) {

			fileData.add(scanner.nextLine());

		}

		scanner.close();

		return fileData;
	}

}
