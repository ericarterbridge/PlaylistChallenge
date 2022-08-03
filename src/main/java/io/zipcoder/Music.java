package io.zipcoder;

import java.util.Arrays;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int selectionIndex = 0;
        int selectionIndex2 = 0;
        int index2 = 0;
        for (int i = 0; i < playList.length; i++){
            if (playList[i].equalsIgnoreCase(selection)){
                selectionIndex = i;
            }
        }
        for (int i = 0; i < selectionIndex; i++){
            if (playList[i].equalsIgnoreCase(selection)){
                selectionIndex2 = i;
                index2 = Math.abs(selectionIndex2 - startIndex);
            } else index2 = Integer.MAX_VALUE;
        }
        int index1 = Math.abs(selectionIndex - startIndex);
        int revIndex1 = startIndex + (playList.length - selectionIndex);
        int revIndex2 = startIndex + (playList.length - selectionIndex2);
        int[] indexArr = new int[4];
        indexArr[0] = index1;
        indexArr[1] = index2;
        indexArr[2] = revIndex1;
        indexArr[3] = revIndex2;
        Arrays.sort(indexArr);

        if (index1 < index2 && index1 < revIndex1 && index1 < revIndex2){
        }
        return indexArr[0];
    }
}
