package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        ArrayList<String> arraylist = new ArrayList<>();
        Collections.addAll(arraylist, array);
        return arraylist.contains(value);
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] results = new String[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            results[array.length - 1 - i] = array[i];
        }
        return results;
    }

    /**
     * @param array array of String objects2
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(array[array.length - i - 1])) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        StringBuilder pangram = new StringBuilder();
        for (String s : array) {
            pangram.append(s);
        }
        for (char a = 'A'; a <= 'Z'; a++)
            if ((pangram.indexOf(String.valueOf(a)) < 0) && (pangram.indexOf(String.valueOf((char) (a + 32))) < 0)) {
                return false;
            }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int valueCount = 0;
        for (String s : array) {
            if (value.equals(s)) {
                valueCount++;
            }
        }
        return valueCount;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> removedValues = new ArrayList<>();
        for (String s : array) {
            if (!valueToRemove.equals(s)) {
                removedValues.add(s);
            }
        }
        return removedValues.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> originalValues = new ArrayList<>(Arrays.asList(array));
        ArrayList<String> newList = new ArrayList<>();
        newList.add(originalValues.get(0));
        for (int i = 1; i < originalValues.size(); i++) {
            if (originalValues.get(i - 1) != originalValues.get(i)) {
                newList.add(originalValues.get(i));
            }
        }
        return newList.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> results = new ArrayList<>();
        results.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i - 1])) {
                results.add(array[i]);
            } else {
                String newString = results.get(results.size() - 1) + array[i];
                results.set(results.size() - 1, newString);
            }
        }
        String[] finalResult = new String[results.size()];
        return results.toArray(finalResult);
    }
}
