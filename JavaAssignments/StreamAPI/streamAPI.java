import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class musicRecords
{
	private int trackID;
	private String album;
	private int length;
	private String track;

	public musicRecords(int trackID, String album, String track, int length) {
		this.trackID = trackID;
		this.album = album;
		this.track = track;
		this.length = length;
	}
	public int getRollno() {
		return trackID;
	}
	public void setRollno(int trackID) {
		this.trackID = trackID;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	@Override
	public String toString() {
		DecimalFormat ft = new DecimalFormat("00");    
		return "musicRecords [trackID=" + trackID + ", album=" + album + ", track=" + track + ", length=" + (length/100) + ":" +ft.format(length%100) + "]";
	}

	
}

public class streamAPI {
	
	public static void main(String args[])
	{
		
		List<musicRecords> ls = new ArrayList<musicRecords>();
		 
		//All music tracks taken here are examples.
		ls.add(new musicRecords(12,"Metallica", "Nothing Else Matters", 647));
		ls.add(new musicRecords(11,"Metallica", "Enter Sandman", 532));  
		ls.add(new musicRecords(04,"And Justice For All", "One", 745)); 
		ls.add(new musicRecords(21,"Back in Black", "Back in Black", 414)); 
		ls.add(new musicRecords(03,"Seventh Son of a Seventh Son", "Can I Play with Madness", 331)); 
		ls.add(new musicRecords(20,"Nevermind", "Smells Like Teen Spirit", 501)); 	
		ls.add(new musicRecords(01,"Three Dog Night", "One", 254));	
		 
		//1. Count - Numer of Tracks in the playlist
		long noOfTracks=ls.stream().count();		 
		System.out.println("Number of tracks in playlist: " + noOfTracks);

		//2. Max - Track with the longest name
		Optional<musicRecords> maxT = ls.stream().max((i,j)->i.getTrack().compareTo(j.getTrack()));
		System.out.println("Track with the longest name: = "+ maxT.get().getTrack());
		
		//3. Min - Track with the shortest duration
		Optional<musicRecords> minT = ls.stream().min((i,j)-> i.getLength() < j.getLength() ? i.getLength() : j.getLength());
		System.out.println("Track with the shortest duration: = "+ minT.get().getTrack() + ", " + minT.get().getAlbum());
				
		//4. Filter - Tracks with name "One"
		Collection<musicRecords> filterCt = ls.stream().filter(track -> track.getTrack() == "One").collect(Collectors.toList());
		System.out.println("Tracks with name \"One\" belong to albums:");
		filterCt.forEach(str->System.out.println(" " + str.getAlbum()));

		// Tracks that are from album "Metallica"
		Collection<musicRecords> filterCt1 = ls.stream().filter(track -> track.getAlbum() == "Metallica").collect(Collectors.toList());
		System.out.println("Tracks that belong to album \"Metallica\":");
		filterCt1.forEach(str->System.out.println(" " + str.getTrack()));

		//5. Map - Unique names of albums wit tracks of duration greater than 5 minutes
		List<String> mapList = ls.stream().filter(st->st.getLength()>500).map(s->s.getAlbum()).distinct().collect(Collectors.toList());
		System.out.println("Names of albums with tracks greater than 5 minutes in length:");
		mapList.forEach(album->System.out.println(" " + album));

		//6. Sort - Sorting tracks according to duration
		System.out.println("Tracks sorted according to duration: ");
		DecimalFormat ft = new DecimalFormat("# ,##");
		ls.stream().sorted(Comparator.comparingInt(dur-> ((musicRecords) dur).getLength())).forEach(mr->System.out.println(" " + mr.getTrack() +" ,"+mr.getAlbum() + ": " + ft.format(mr.getLength())));	
		
		
		
	 
	}
	
	

}
