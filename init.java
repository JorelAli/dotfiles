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
import javax.script.*;
import java.text.SimpleDateFormat;

public class init {
	
	public static void clear() { //literally prints out "Ctrl + L"
		System.out.println("\033[H\033[2J");
	}

	public static void javascript(String str) throws ScriptException {
		new ScriptEngineManager().getEngineByName("nashorn").eval(str);
	}

	public static void addTime(String now, String str) {
		int currentHrs = Integer.parseInt(now.split(":")[0]);
		int currentMins = Integer.parseInt(now.split(":")[1]);

		int targetHrs = Integer.parseInt(str.split(":")[0]);
		int targetMins = Integer.parseInt(str.split(":")[1]);

		if(targetMins >= 60) {
			targetHrs += targetMins / 60;
			targetMins = targetMins % 60;
		}

		currentHrs += targetHrs;
		currentMins += targetMins;

		if(currentMins >= 60) {
			currentHrs += currentMins / 60;
			currentMins = currentMins % 60;
		}

		if(currentHrs > 23) {
			System.out.println("(+" + (currentHrs / 24) + " days)");
			currentHrs = currentHrs % 24;
		}

		System.out.println(currentHrs + ":" + currentMins);
	}

	public static void addTime(String str) {
		addTime(new SimpleDateFormat("HH:mm").format(new Date()), str);
	}

}
