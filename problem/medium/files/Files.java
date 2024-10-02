package problem.medium.files;

public class Files {
    static final int MAX_VOLUME_OF_FILE = 25;
    static final int CONVERT_MB_TO_GB = 1000;
    static final String FILE_EXTENSION_MB = "MB";
    static final String FILE_EXTENSION_GB = "GB";

    final String fileName;
    final String fileExtension;
    String content;
    final String parentFolder;


    public Files(String fileName, String fileExtension, String content, String parentFolder) {
        this.fileName = fileName;
        this.fileExtension = validateFileExtension(fileExtension);
        this.content = content;
        this.parentFolder = parentFolder;
    }

    public String getLifetimeBandwidthSize() {
        var volumeOfMb = (content.length() * MAX_VOLUME_OF_FILE);
        return volumeOfMb < CONVERT_MB_TO_GB ? volumeOfMb + FILE_EXTENSION_MB : calcMbToGb(volumeOfMb) + FILE_EXTENSION_GB;
    }

    public String prependContent(String data) {
        content = data + content;
        return content;
    }

    public String addContent(String data, int position) {
        // 最初書いたやつ
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < content.length(); i++) {
//            if (i == position) {
//                sb.append(data);
//            }
//            sb.append(content.charAt(i));
//        }

        // リファクタ候補
        StringBuilder sb = new StringBuilder(content);
        sb.insert(position, data);

        content = sb.toString();
        return content;
    }

    public String showFileLocation() {
        return parentFolder + " > " + fileName + fileExtension;
    }

    private String validateFileExtension(String inputFileExtension) {
        if (inputFileExtension.equals(".word") || inputFileExtension.equals(".png") || inputFileExtension.equals(".mp4") || inputFileExtension.equals(".pdf")) {
            return inputFileExtension;
        }

        return ".txt";
    }

    private String calcMbToGb(double volumeOfMb) {
        // 最初書いたやつ
//        return String.valueOf(volumeOfMb / CONVERT_MB_TO_GB);

        // リファクタ候補
        return String.format("%.3f", volumeOfMb / CONVERT_MB_TO_GB);
    }
}
