package Music;

public class Music implements Comparable {
	private String title;
	private String singer;
	
	public Music() {}
	
	public Music(String title,String singer) {
		this.title=title;
		this.singer=singer;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String titel) {
		this.title=title;
	}
	
	public String getSinger() {
		return singer;
	}
	
	public void setSinger(String singer) {
		this.singer=singer;
	}
	
	@Override
	public String toString() {
		return singer + " - " + title;
	}
	
	@Override
	public int compareTo(Object o) {
		String other = ((Music)o).getSinger();
		return -singer.compareTo(other);
	}
}