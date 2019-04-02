import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.awt.Desktop;
import java.net.URI;
import java.net.*;
import java.io.*;
import java.nio.*;
import java.util.*;
import java.awt.*;
import java.lang.reflect.*;
import java.util.stream.*;

public void clear() { //literally prints out "Ctrl + L"
	System.out.println("\033[H\033[2J");
}

public double solveRatio() {
	Scanner s = new Scanner(System.in);
	String str = s.nextLine();
	String str2 = s.nextLine();
	String[] a1 = str.replace(" ", "").split(":");
	String[] a2 = str2.replace(" ", "").split(":");

	int index = 0;

	//Find index
	if(a1[0].equals("?")) {
		index = 0;
	} else if(a1[1].equals("?")) {
		index = 1;
	} else if(a2[0].equals("?")) {
		index = 2;
	} else {
		index = 3;
	}

	double result = 0;
	switch(index) {
		case 0:
			return Double.parseDouble(a1[1]) * Double.parseDouble(a2[0]) / Double.parseDouble(a2[1]);
		case 1:
			return Double.parseDouble(a1[0]) * Double.parseDouble(a2[1]) / Double.parseDouble(a2[0]);
		case 2:
			return Double.parseDouble(a2[1]) * Double.parseDouble(a1[0]) / Double.parseDouble(a1[1]);
		case 3:
			return Double.parseDouble(a2[0]) * Double.parseDouble(a1[1]) / Double.parseDouble(a1[0]);
	}
	return 0;

}
