package kodlamaio.northwind.business.concretes;

import java.util.List;

import kodlamaio.northwind.business.abstracts.JobPositionService;
import kodlamaio.northwind.dataAccess.abstracts.JobPositionDao;
import kodlamaio.northwind.entities.concretes.JobPosition;

public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;
	
	public JobPositionManager(JobPositionDao jobPositionDao) {
		
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		
		return jobPositionDao.findAll();
	}

}
