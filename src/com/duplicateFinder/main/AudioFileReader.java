package com.duplicateFinder.main;

import java.io.File;
import java.io.IOException;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;

public class AudioFileReader {

	public static Tag getTagsForSong(File song) throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException{
		AudioFile file = AudioFileIO.read(song);
		return file.getTag();
		
	}
}
