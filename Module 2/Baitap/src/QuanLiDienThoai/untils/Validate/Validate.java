package QuanLiDienThoai.untils.Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String CHI_PHI = "^[0-9]*$";

    private static final String PHAM_VI ="^((ToanQuoc) | (QuocTe))+$";
    private static final String QUOC_GIA ="^[VietNam]{0}$";

    private static final String TRANG_THAI = "^([DaSuaChua]+ | [ChuaSuaChua]+)$";
    public boolean testChiPhi(String chiPhi){
        Pattern pattern = Pattern.compile(CHI_PHI);
        Matcher matcher = pattern.matcher(chiPhi);
        boolean isValidate = matcher.matches();
        return isValidate;
    }

    public boolean testPhamVi(String phamVi){
        Pattern pattern = Pattern.compile(PHAM_VI);
        Matcher matcher = pattern.matcher(phamVi);
        boolean isValidate = matcher.matches();
        return isValidate;
    }

    public boolean testQuocGia(String quocGia){
        Pattern pattern = Pattern.compile(QUOC_GIA);
        Matcher matcher = pattern.matcher(quocGia);
        boolean isValidate = matcher.matches();
        return isValidate;
    }

    public boolean testTrangThai(String trangThai){
        Pattern pattern = Pattern.compile(TRANG_THAI);
        Matcher matcher = pattern.matcher(trangThai);
        boolean isValidate = matcher.matches();
        return isValidate;
    }
}
