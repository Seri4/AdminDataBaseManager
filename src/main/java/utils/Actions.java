package utils;

import entites.User;

import java.util.List;

public interface Actions {
    public void createEntry(Object currentEntry);

    public void deleteEntry(Object currentEntry);

    public void updateEntry(Object currentEntry);

    public List<User> getAllEntries();

    public Object getEntryById(int id);
}
