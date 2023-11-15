public class Main {
    public static void main(String[] args) {
        // buat object CPU
        CPU myKomputer = new CPU(15000000, "Lenovo");

        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");

        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");

        CPU.Tugas TugasPBO = myKomputer.new Tugas("SSD", "ATX", "ATX", "NVIDIA NV4");

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();
        TugasPBO.getTugasInfo();

        // bikin object harddisk, vga, motherboard, powersupply
    }
}