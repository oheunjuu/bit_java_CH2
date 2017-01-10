package java_2017_CH2;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(){
		this(7,20,false);
	}
	
	public TV(int channel,int volume, boolean power){
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean isPower() {
		return power;
	}
	
	public void power(boolean on){
		if(on==true){
			System.out.println("TV Power On");
		}else{
			System.out.println("TV Power off");
		}
		this.power=on;
	}
	
	public void channel(int num){
		if(num>255){
			num=1;
		}
		else if (num<1){
			num=255;
		}
		this.channel=num;
		System.out.println("Channel num: "+num);
	}
	
	public void channel(boolean up){
		if(up==true){
			if(channel>=255){
				channel=1;
			}
			else{
				channel++;
			}
		}
		else{
			if(channel<=1){
				channel=255;
			}
			else{
				channel--;
			}
		}
	}
	
	public void volume(int num){
		if(num>100){
			num=100;
		}
		else if(num<1){
			num=1;
		}
		this.volume=num;
		System.out.println("Volume num: "+num);
	}
	
	public void volume(boolean up){
		if(up==true){
			if(volume>=100){
				volume=100;
			}
			else{
				volume++;
			}
		}
		else{
			if(volume<=1){
				volume=1;
			}
			else{
				volume--;
			}
		}
	}
	
	public void status(){
		System.out.println("Power: "+ (power ? "on":"off") + " , Channel: "+channel+" , Volume: "+volume);
	}
}
