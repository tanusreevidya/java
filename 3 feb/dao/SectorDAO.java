package com.cts.training.dao;
import com.cts.training.model.Sector;
import java.util.List;


public interface SectorDAO {

	public boolean addSector(Sector sector);

	public boolean updateSector(Sector sector);

	public boolean deleteSector(Sector sector);

	public Sector getSectorById(int id);

	public List<Sector> getAllSectors();
}
