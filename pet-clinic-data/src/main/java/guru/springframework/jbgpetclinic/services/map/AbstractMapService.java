package guru.springframework.jbgpetclinic.services.map;

import guru.springframework.jbgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){

        return new HashSet<>(map.values());
    }

    T findById(Long id){

        return map.get(id);
    }

    T save(T object){

        if (object != null){
            if(object.getId()== null){
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        }
        else {
            throw new RuntimeException("Object to save can not be null");
        }

        return object;
    }

    void deleteById(ID id){

        map.remove(id);
    }

    void deleteByObject(T object){

        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }

    private Long getNextId(){
        if (!map.isEmpty())
        return Collections.max(map.keySet()) + 1;
        else return 1L;
    }



}
