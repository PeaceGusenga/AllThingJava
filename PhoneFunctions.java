package Exercise;


public class PhoneFunctions {

	private int state;
	private String type;
	private String brightness;
	private String music;
	private int volume;
	
	
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		if(state == 1){
			System.out.println("Phone is turned On");
		}else{
			System.out.println("Off");
		}
		this.state = state;
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrightness() {
		return brightness;
	}
	public void setBrightness(int brightness) {
		this.brightness = brightness + "%";
	}
	
	public String getMusic() {
		return music;
	}
	public void setMusic(String music) {
		this.music = music;
		
		if(volume <= 0){
			System.out.println("Your phone is muted!");
		}else{
			System.out.println("You are playing "+ music);
		}
				
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("Volume: "+volume);
	}
	

}
