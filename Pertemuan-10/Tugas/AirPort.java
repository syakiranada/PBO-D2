/* 
File     : AirPort.java
Tanggal  : 24 Mei 2024
Pembuat  : Syakira Nada Nirwana - 24060122130049
Deskripsi: kelas AirPort
*/

public class AirPort {
    private Airplane airplane;
    private String name;

    public AirPort(){

    }

    public AirPort(String name){
        this.name = name;
    }

    public String givePermissionToLand(IFlyer flyer){
        if (flyer instanceof Airplane){
            return flyer + " diizinkan untuk mendarat";
        }
        else{
            return "Izin mendarat ditolak";
        }
    }
}
