package com.duplicateFinder.main;

import java.util.ArrayList;
import java.util.List;

import org.jaudiotagger.audio.mp3.MP3File;

public class MusicLibrary {

	public static List<MP3File> uniqueSongsList = new ArrayList<MP3File>();
	public static List<MP3File> duplicatesFromUniqueSongsList = new ArrayList<MP3File>();
}
