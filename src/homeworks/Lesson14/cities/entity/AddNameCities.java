package homeworks.Lesson14.cities.entity;

import homeworks.Lesson14.cities.util.Input;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddNameCities {
    private List<String> cities = new ArrayList<>();

    public AddNameCities(List<String> cities) {
        this.cities = cities;
    }

    public AddNameCities() {
    }

    public String addNameCities(String city) {
        if (city.equalsIgnoreCase("Сдаюсь")) {
            return city;
        }
        if (!checkEmpty()) {
            if (!checkLetters(city)) {
                System.out.println("Буква не подходит. Введите другое название города");
                return addNameCities(Input.getString());
            }
            if (checkDuplicateCities(city)) {
                System.out.println("Такое название уже было. Введите другое название города");
                return addNameCities(Input.getString());
            }
        }
        inputNameCities(city);
        return city;
    }

    private boolean checkEmpty() {
        if (cities.isEmpty()) {
            return true;
        }
        return false;
    }


    private boolean checkDuplicateCities(String city) {
        for (String s : cities) {
            if (s.equalsIgnoreCase(city)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkLetters(String city) {
        city = city.toLowerCase();
        StringBuilder stringBuilderCity = new StringBuilder(city);
        Character letterCity = stringBuilderCity.charAt(0);
        int index = 0;
        for (String s : cities) {
            index++;
        }
        String lastCity = cities.get(index - 1);
        Character lastCityLetter = blackListLettersCheck(lastCity);
        if (lastCityLetter.equals(letterCity)) {
            return true;
        }
        return false;
    }

    private Character blackListLettersCheck(String lastCity) {
        StringBuilder stringBuilderLastCity = new StringBuilder(lastCity);
        Character lastCityLetter = stringBuilderLastCity.charAt(stringBuilderLastCity.length() - 1);
        String strLastCityLetter = String.valueOf(lastCityLetter);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/homeworks/Lesson14/cities/blackList/blackList.txt"))) {
            String blackListLetter;
            while ((blackListLetter = bufferedReader.readLine()) != null) {
                if (blackListLetter.equalsIgnoreCase(strLastCityLetter)) {
                    return stringBuilderLastCity.charAt(stringBuilderLastCity.length() - 2);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lastCityLetter;
    }

    private void inputNameCities(String city) {
        cities.add(city);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/homeworks/Lesson14/cities/blackList/listCities.txt"))) {
            bufferedWriter.write(cities.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
