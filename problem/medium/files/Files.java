package problem.medium.files;

public class Files {
    static final int maxVolumeOfFile = 25;
    static final int convertMbToGb = 1000;
    static final String fileExtensionMb = "MB";
    static final String fileExtensionGb = "GB";

    String fileName;
    String fileExtension;
    String content;
    String parentFolder;


    public Files(String fileName, String fileExtension, String content, String parentFolder) {
        this.fileName = fileName;
        this.fileExtension = validateFileExtension(fileExtension);
        this.content = content;
        this.parentFolder = parentFolder;
    }

    public String getLifetimeBandwidthSize() {
        var volumeOfMb = (content.length() * maxVolumeOfFile);
        return volumeOfMb < convertMbToGb ? volumeOfMb + fileExtensionMb : calcMbToGb(volumeOfMb) + fileExtensionGb;
    }

    public String prependContent(String data) {
        content = data + content;
        return content;
    }

    public String addContent(String data, int position) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < content.length(); i++) {
            if (i == position) {
                sb.append(data);
            }
            sb.append(content.charAt(i));
        }

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
        return String.valueOf(volumeOfMb / convertMbToGb);
    }
}
