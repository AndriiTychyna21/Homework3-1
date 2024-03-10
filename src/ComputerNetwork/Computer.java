package ComputerNetwork;

public class Computer {
    private String ip;

    public Computer(){
        this.ip = "0.0.0.0";
    }

    public Computer(String ip){
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
