
import java.util.Date;

public class LibraryMember {

    private String namaLengkap;
    private String alamat;
    private String nomorTelepon;
    private String email;
    private String jenisKelamin;
    private String kodeAnggota;
    private Date tanggalGabung;
    private boolean statusAktif;
    private String tingkatKeanggotaan;
    private int jumlahBukuDipinjam;
    private int jumlahTerlambat;
    private int jumlahDenda;
    private int poinLoyalitas;
    private String kodeReferal;
    private boolean langgananBuletin;

class InformasiPribadi {
    private String namaLengkap;
    private String alamat;
    private String nomorTelepon;
    private String email;
    private String jenisKelamin;
}

class InformasiKeanggotaan {
    private String kodeAnggota;
    private Date tanggalGabung;
    private boolean statusAktif;
    private TingkatKeanggotaan tingkatKeanggotaan;
    private int jumlahBukuDipinjam;
}

class InformasiKeuangan {
    private int jumlahTerlambat;
    private int jumlahDenda;
    private int poinLoyalitas;
    private String kodeReferal;
    private boolean langgananBuletin;
}
{

        this.namaLengkap = namaLengkap;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
        this.jenisKelamin = jenisKelamin;
        this.kodeAnggota = kodeAnggota;
        this.tanggalGabung = tanggalGabung;
        this.statusAktif = statusAktif;
        this.tingkatKeanggotaan = tingkatKeanggotaan;
        this.jumlahBukuDipinjam = jumlahBukuDipinjam;
        this.jumlahTerlambat = jumlahTerlambat;
        this.jumlahDenda = jumlahDenda;
        this.poinLoyalitas = poinLoyalitas;
        this.kodeReferal = kodeReferal;
        this.langgananBuletin = langgananBuletin;
    }

    public void cetakProfilLengkap() {
        System.out.println("===== PROFIL ANGGOTA =====");
        cetakInformasiPribadi();
        cetakInformasiKeanggotaan();
        cetakInformasiKeuangan();
        System.out.println("Skor Risiko : " + hitungSkorRisiko());
        System.out.println("Layak Upgrade?: " + periksaKelayakanUpgrade());
        System.out.println("===========================");
    }

    private void cetakInformasiPribadi() {
        System.out.println("Nama         : " + namaLengkap);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat       : " + alamat);
        System.out.println("Telepon      : " + nomorTelepon);
        System.out.println("Email        : " + email);
    }

    private void cetakInformasiKeanggotaan() {
        System.out.println("Kode Anggota : " + kodeAnggota);
        System.out.println("Tanggal Gabung: " + tanggalGabung);
        System.out.println("Status Aktif : " + statusAktif);
        System.out.println("Tingkat      : " + tingkatKeanggotaan);
        System.out.println("Buku Dipinjam: " + jumlahBukuDipinjam);
    }

    private void cetakInformasiKeuangan() {
        System.out.println("Terlambat    : " + jumlahTerlambat);
        System.out.println("Denda        : Rp " + jumlahDenda);
        System.out.println("Poin         : " + poinLoyalitas);
        System.out.println("Kode Referal : " + kodeReferal);
        System.out.println("Langganan Buletin: " + langgananBuletin);
    }

    public void langgananBuletinPerpustakaan() {
    }

    public void gunakanKodeReferal(String kode) {
    }

public enum TingkatKeanggotaan {
    DASAR, MENENGAH, MAHIR;
}

private TingkatKeanggotaan tingkatKeanggotaan;

public boolean periksaKelayakanUpgrade() {
    if (tingkatKeanggotaan == TingkatKeanggotaan.DASAR && poinLoyalitas > 100) {
        return true;
    }
    return false;
}


public double hitungSkorRisiko() {
    double skor = 0;
    skor += hitungTerlambatRisiko();
    skor += hitungDendaRisiko();
    skor += hitungStatusAktifRisiko();
    skor += hitungTingkatKeanggotaanRisiko();
    skor += hitungJumlahBukuDipinjamRisiko();
    return skor;
}

private double hitungTerlambatRisiko() {
    return jumlahTerlambat * 1.5;
}

private double hitungDendaRisiko() {
    return jumlahDenda * 0.1;
}

private double hitungStatusAktifRisiko() {
    return !statusAktif ? 5 : 0;
}

private double hitungTingkatKeanggotaanRisiko() {
    return tingkatKeanggotaan.equals("DASAR") ? 2 : 0;
}

private double hitungJumlahBukuDipinjamRisiko() {
    return jumlahBukuDipinjam > 50 ? -1.5 : 0;
}
// Jika tidak digunakan, bisa dihapus
// public void langgananBuletinPerpustakaan() { }
}
