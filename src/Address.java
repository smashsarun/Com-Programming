
public class Address {
    private int addrNum;
    private String street;
    private String province;

    public Address(int addrNum, String street, String province) {
        this.addrNum = addrNum;
        this.street = street;
        this.province = province;
    }

    public int getAddrNum() {
        return addrNum;
    }

    public void setAddrNum(int addrNum) {
        this.addrNum = addrNum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Address{" + "addrNum=" + addrNum + ", street=" + street + ", province=" + province + '}';
    }
    
    
}
