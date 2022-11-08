package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		if (programmingLanguage.getName() == null) {
			System.out.println("Programlama dili boş geçilemez.");
		}
		for (ProgrammingLanguage programmingLanguage2 : getAll()) {
			if (programmingLanguage2.getName()==programmingLanguage.getName()) {
				System.out.println("İsimler tekrar edilemez.");
			}
		}
	}

	@Override
	public void delete(int id) {
		for (ProgrammingLanguage programmingLanguage2 : getAll()) {
			if (programmingLanguage2.getId()==id) {
				programmingLanguageRepository.delete(id);
			}
			else {
				System.out.println("ID bulunamadı.");
			}
		}
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		programmingLanguageRepository.update(programmingLanguage);
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) throws Exception {
		return programmingLanguageRepository.getById(id);
	}

}
