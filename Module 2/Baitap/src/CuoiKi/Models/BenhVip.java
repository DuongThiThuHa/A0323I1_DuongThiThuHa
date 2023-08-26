package CuoiKi.Models;

public class BenhVip extends BenhAn{
    private String vipI;
    private String vipII;
    private String vipIII;

    public BenhVip() {
    }

    public BenhVip(int soLuong, int ma, String ten, String ngayVao, String ngayRa, String lyDo) {
        super(soLuong, ma, ten, ngayVao, ngayRa, lyDo);
    }

    public BenhVip(String vipI, String vipII, String vipIII) {
        this.vipI = vipI;
        this.vipII = vipII;
        this.vipIII = vipIII;
    }

    public BenhVip(int soLuong, int ma, String ten, String ngayVao, String ngayRa, String lyDo, String vipI, String vipII, String vipIII) {
        super(soLuong, ma, ten, ngayVao, ngayRa, lyDo);
        this.vipI = vipI;
        this.vipII = vipII;
        this.vipIII = vipIII;
    }

    public String getVipI() {
        return vipI;
    }

    public void setVipI(String vipI) {
        this.vipI = vipI;
    }

    public String getVipII() {
        return vipII;
    }

    public void setVipII(String vipII) {
        this.vipII = vipII;
    }

    public String getVipIII() {
        return vipIII;
    }

    public void setVipIII(String vipIII) {
        this.vipIII = vipIII;
    }

    @Override
    public String toString() {
        return super.toString()+vipI+","+vipII+","+vipIII;
    }
}
