package org.example.problem.easy;

import java.util.Arrays;
import java.util.Objects;

public class WebsitePagination {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(websitePagination(new String[]{"url1", "url2", "url3", "url4", "url5", "url6"}, 4, 2)));
        System.out.println(Arrays.toString(refactorWebsitePagination(new String[]{"url1", "url2", "url3", "url4", "url5", "url6"}, 4, 2)));
    }

    public static String[] websitePagination(String[] urls, int pageSize, int page){
        int arraySize = (urls.length / pageSize) + 1;
        String[][] pagination = new String[arraySize][pageSize];
        int urlsIndex = 0;

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < pageSize; j++) {
                if (urlsIndex < urls.length) {
                    pagination[i][j] = urls[urlsIndex];
                    urlsIndex++;
                }
            }
        }

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < pageSize; j++) {
                if (urlsIndex >= urls.length) {
                    break;
                }
                pagination[i][j] = urls[urlsIndex];
                urlsIndex++;
            }
        }

        return removeNull(pagination[page - 1]);
    }

    private static String[] removeNull(String[] includeNullArray) {
        int count = (int) Arrays.stream(includeNullArray).filter(Objects::nonNull).count();

        String[] excludeNullArray = new String[count];
        System.arraycopy(includeNullArray, 0, excludeNullArray, 0, count);

        return excludeNullArray;
    }

    public static String[] refactorWebsitePagination(String[] urls, int pageSize, int page) {
        // 区切りのはじめにアクセスするため
        int start = (page - 1) * pageSize;
        // お尻を超えないための比較
        int end = Math.min(start + pageSize, urls.length);

        // pageを直指定できるので、urlsを超えた指定をされた場合の対応
        if (start >= urls.length) {
            return new String[0];
        }

        return Arrays.copyOfRange(urls, start, end);
    }
}
