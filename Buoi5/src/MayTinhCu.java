/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Phanh
 */
public class MayTinhCu extends MayTinh{
//    Lớp MayTinhCu kế thừa lớp MayTinh. Có thêm thuộc tính tuoiTho
    private int tuoiTho;

    public MayTinhCu() {
    }

    public MayTinhCu(int tuoiTho, String ten, String hang, double donGia) {
        super(ten, hang, donGia);
        this.tuoiTho = tuoiTho;
    }

    @Override
    public String toString() {
        return super.toString()+  "tuoiTho=" + tuoiTho + '}';
    }
    
}
