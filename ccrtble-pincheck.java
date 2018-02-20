public class ccrtble-pincheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

	String serial = "xxxxxxxxxx";       
        
        byte serialbytes[] = serial.getBytes();
        String pin;
               
        pin = Integer.toString((serialbytes[3] ^ serialbytes[7]) % 10);
        pin += Integer.toString((serialbytes[4] ^ serialbytes[8]) % 10);
        pin += Integer.toString((serialbytes[5] ^ serialbytes[9]) % 10);
        pin += Integer.toString(((serialbytes[6] - 48) ^ (serialbytes[0] - 65)) % 10);
        
        System.out.println(pin);
    } 
}
