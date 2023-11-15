import java.text.NumberFormat;
import java.util.Locale;
public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }
    public class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    public class RAM {
        int jumlahRAM;
        String manufacturer;

        RAM(int jumlahRAM, String manufacturer) {
            this.jumlahRAM = jumlahRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoRAM() {
            System.out.println("Jumlah RAM: " + this.jumlahRAM);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);

        // menuliskan harga yang double ke dalam format rupiah
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }

    // inner class Harddisk
    // inner class Motherboard
    // inner class PowerSuply
    // inner class VGACard

    public class Tugas {
        String Harddisk;
        String Motherboard;
        String PowerSuply;
        String VGACard;

        Tugas(String Harddisk, String Motherboard, String PowerSuply, String VGACard) {
            this.Harddisk = Harddisk;
            this.Motherboard = Motherboard;
            this.PowerSuply = PowerSuply;
            this.VGACard = VGACard;
        }

        public void getTugasInfo() {
            System.out.println("Harddisk: " + this.Harddisk);
            System.out.println("MotherBoard: " + this.Motherboard);
            System.out.println("PowerSuply: " + this.PowerSuply);
            System.out.println("VGACard: " + this.VGACard);
        }

    }
}