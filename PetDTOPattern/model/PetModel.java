package model;

import java.util.HashMap;
import model.dto.Pet;
import exception.PetInvalidateException;

public class PetModel {

	//key = 주인 이름, value = 애완견 정보 Pet인 Hashmap
	static HashMap<String, Pet> pets = new HashMap<String, Pet>();
	
	static {
		pets.put("수진", new Pet("주리", "시추", 5, 'y'));
		pets.put("현오", new Pet("구름", "말티즈", 7, 'y'));
		pets.put("영애", new Pet("솜이", "푸들", 2, 'n'));	
	}
	
	//pets를 전부 리턴하는 메소드 petAll
	public static HashMap<String, Pet> petAll() {
		return pets;
	}
	
	//주인 이름을 주면 찾아서 애완견 정보를 리턴하는 메소드 petOne
	//주인 이름이 없으면 예외 발생
	public static Pet petOne(String owner) throws Exception{
		Pet p = pets.get(owner);
		if (p == null) {
			throw new Exception();
		} else {
			return p;
		}
	}
	


	/* crud */
	
	/* create() - Pet 객체를 pets에 저장. 중복인 경우 저장 못하고 PetInvalidateException 발생 */
	public static void create(String newOwner, Pet newPet) throws PetInvalidateException {
		if (pets.containsKey(newOwner)) {
			throw new PetInvalidateException("이미 정보가 있습니다.");
		} else {
			pets.put(newOwner, newPet);
			System.out.println(newOwner + "님의 정보가 저장되었습니다.");
		}
	}
	
	/* read() - 사람 이름으로 검색, 있을 경우 pet 반환 없으면 null 반환 */
	public static Pet read(String ownerName) {
		Pet p = pets.get(ownerName);
		if (p != null) {
			return p;
		} else {
			return null;
		}
	}
	
	/* update() - 사람 이름으로 검색 후 애완견 백신여부 갱신 */
	public static void update(String ownerName, char newVaccine) {
		Pet p = pets.get(ownerName);
		if (pets.containsKey(ownerName)) {
			p.setVaccine(newVaccine);
			System.out.println(ownerName + "님의 애완견 백신 정보가 " + newVaccine + "으로 변경되었습니다.");
		} else {
			System.out.println("백신 정보 갱신이 실패되었습니다.");
		}	
	}
	
	/* delete() - 사람 이름으로 검색해서 pet 지우기 */
	public static void delete(String ownerName) {
		if (pets.containsKey(ownerName)) {
			pets.remove(ownerName);
			System.out.println(ownerName + "님의 정보가 삭제되었습니다.");
		} else {
			System.out.println("삭제가 실패되었습니다.");
		}
	}
}
