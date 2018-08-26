package com.mycompany.computershop;

import com.mycompany.computershop.model.Computer;
import com.mycompany.computershop.model.parts.*;
import com.mycompany.computershop.repositories.partsRepositories.CaseTypeRepository;
import com.mycompany.computershop.services.ComputerService;
import com.mycompany.computershop.services.ManufacturerService;
import com.mycompany.computershop.services.partsServices.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private ComputerService computerService;
    @Autowired
    private ComputerTypeService computerTypeService;
    @Autowired
    private ComputerCaseService computerCaseService;
    @Autowired
    private CpuService cpuService;
    @Autowired
    private HddService hddService;
    @Autowired
    private MonitorService monitorService;
    @Autowired
    private MotherBoardService motherBoardService;
    @Autowired
    private PowerBlockService powerBlockService;
    @Autowired
    private RamService ramService;
    @Autowired
    private VgaService vgaService;

    @Autowired
    private CaseTypeService caseTypeService;

    @Autowired
    private ManufacturerService manufacturerService;

    @Autowired
    private MonitorTypeService monitorTypeService;

    @Autowired
    private MemorySizeService memorySizeService;

    @Override
    public void run(String... args) throws Exception {

        CaseType midiTower = new CaseType("MidiTower");
        CaseType themaltake = new CaseType("Themaltake");
        caseTypeService.save(midiTower);
        caseTypeService.save(themaltake);

        Manufacturer intel = new Manufacturer("Intel", "U.S.A", "Largest computer parts distributor in world");
        manufacturerService.save(intel);
        Manufacturer amd = new Manufacturer("AMD", "U.S.A", "American multinational semiconductor company");
        manufacturerService.save(amd);

        MonitorType led = new MonitorType("LED");
        MonitorType lcd = new MonitorType("LCD");
        monitorTypeService.save(led);
        monitorTypeService.save(lcd);

        MemorySize twoGb = new MemorySize(2048);
        MemorySize fourGb = new MemorySize(4096);
        memorySizeService.save(twoGb);
        memorySizeService.save(fourGb);


        ComputerType extreme = new ComputerType("Extreme", "test description", 111);
        computerTypeService.save(extreme);
        ComputerCase computerCase = new ComputerCase("Big case", "test description", 222.00, midiTower, 7.22);
        computerCaseService.save(computerCase);
        Cpu amdFx = new Cpu("AMD FX-6300", amd, 67.79, 3500, 8, "test description");
        cpuService.save(amdFx);
        Cpu skylake = new Cpu("i3-6100", amd, 137.79, 3700, 4, "test description");
        cpuService.save(skylake);
        Hdd hdd = new Hdd("hdd", "test description", 444, 500);
        hddService.save(hdd);
        Monitor monitor = new Monitor("Samsung", "test description", 79, led, intel, 21.00);
        monitorService.save(monitor);
        MotherBoard motherBoard = new MotherBoard("motherboard", "desc", 15, intel, 2148);
        motherBoardService.save(motherBoard);
        PowerBlock powerBlock = new PowerBlock("powerblock 1", "description", 13, 2445, 115);
        powerBlockService.save(powerBlock);
        Ram ram = new Ram("255gb", "huge", 554, intel,2556, twoGb);
        ramService.save(ram);
        Vga vga = new Vga("GeForce 2", "description", 115, intel, 5114, fourGb);
        vgaService.save(vga);


        computerService.save(new Computer("IBM", extreme,amdFx,motherBoard,vga,hdd,ram,powerBlock,monitor,computerCase));
    }
}
