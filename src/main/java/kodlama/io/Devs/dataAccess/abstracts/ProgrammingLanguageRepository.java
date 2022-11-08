package kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	void add(ProgrammingLanguage programmingLanguage);
	void delete(int id);
	void update(ProgrammingLanguage programmingLanguage);
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id) throws Exception;
}
