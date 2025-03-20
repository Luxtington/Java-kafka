package ru.luxtington.appProducer.dao;

import org.springframework.stereotype.Service;
import ru.luxtington.appProducer.model.Computer;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComputerDao {
    private List<Computer> allComputers;
    private static int currId;

    {
        allComputers = new ArrayList<>();
        allComputers.add(new Computer(++currId, "Monster", 30000, 2020));
        allComputers.add(new Computer(++currId, "Banana", 70000, 2016));
        allComputers.add(new Computer(++currId, "Kitchen", 55000, 2024));
    }

    public List<Computer> index(){
        return allComputers;
    }

    public Computer getComputerByIndex(int id){
        Computer pc = allComputers.stream()
                .filter(computer -> id == computer.getId())
                .findFirst()
                .orElse(null);
        return pc;
    }

    public void addComputer(Computer computer){
        computer.setId(++currId);
        allComputers.add(computer);
    }

    public void updateComputer(int id, Computer updatedComputer){
        Computer pc = getComputerByIndex(id);
        pc.setBuildTitle(updatedComputer.getBuildTitle());
        pc.setCost(updatedComputer.getCost());
        pc.setYearOfProduce(updatedComputer.getYearOfProduce());
    }

    public void deleteComputer(int id){
        Computer pc = getComputerByIndex(id);
        if (pc != null)
            allComputers.remove(pc);
    }
}
