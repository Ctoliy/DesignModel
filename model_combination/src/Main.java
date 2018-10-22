import java.util.List;

/**
 * @create 2018-10-22 15:45 by Toliy
 * @desc
 **/
public class Main {
    public static void main(String[] args) {
        //跟目录
        Dirs root, folder1, folder2, folder3, txt1, txt2, txt3, image1, image2, image3, medical1, medical2, medical3, readme;
        root = new Dir("root");
        folder1 = new Dir("电子书");
        folder2 = new Dir("美图");
        folder3 = new Dir("视频");
        txt1 = new Txt("三国演义.txt");
        txt2 = new Txt("水浒传.txt");
        txt3 = new Txt("西游记.txt");
        image1 = new Image("二哈你最刷.jpg");
        image2 = new Image("炮炮兵.jpg");
        image3 = new Image("蓝胖子.jpg");
        medical1 = new Video("康熙王朝.mp4");
        medical2 = new Video("李卫当官.mp4");
        medical3 = new Video("天龙八部.mp4");
        readme = new Txt("readme.txt");
        root.addDirs(readme);
        root.addDirs(folder1);
        root.addDirs(folder2);
        root.addDirs(folder3);
        folder1.addDirs(txt1);
        folder1.addDirs(txt2);
        folder1.addDirs(txt3);
        folder2.addDirs(image1);
        folder2.addDirs(image2);
        folder2.addDirs(image3);
        folder3.addDirs(medical1);
        folder3.addDirs(medical2);
        folder3.addDirs(medical3);
        System.out.println("来来来，让我来显摆下我的收藏");
        root.display("");
        System.out.println("算了，不怎么喜欢看水浒传，就不要它了吧");
        Dirs txt = root.getChild(1);
        if (txt instanceof Dir) {
            Dir dir = (Dir) txt;
            List ll = dir.getDirsList();
            if (ll.size() != 0) {
                Object o1 = ll.get(0);
                if (o1 instanceof Txt) {
                    Txt t1 = (Txt) o1;
                    folder1.delDirs(t1);
                }
                if (o1 instanceof Image) {
                    Image t1 = (Image) o1;
                    folder2.delDirs(t1);
                }
                if (o1 instanceof Video) {
                    Video t1 = (Video) o1;
                    folder3.delDirs(t1);
                }
            }
        } else {
            //目前根路径只有readme.txt文件
            if (txt instanceof Txt) {
                Txt t1 = (Txt) txt;
                root.delDirs(t1);
            }
        }

        root.display("");
    }
}
