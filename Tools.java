package newCarSystem;

import java.time.*;

// Tools类提供了一些静态工具方法，用于执行常见的任务，如获取当前时间、帮助信息等。
public class Tools {

    // 获取当前时间，以小时和分钟的组合形式返回
    public static int getTime() {
        return LocalTime.now().getHour() * 100 + LocalTime.now().getMinute();
    }

    // 计算价格方法，目前为占位符，需要具体实现
    // @param enterTime 进入时间
    // @return int 计算得到的价格
    public int countPrice(int enterTime) {
        // TODO: 根据进入时间和当前时间计算停车费用
        int yourPrice = 0;
        return yourPrice;
    }

    // 提供帮助信息方法，打印帮助信息到控制台
    public static void getHelp() {
        System.out.println("Help list.");
    }

    // 解析车位信息方法，目前为占位符，需要具体实现
    // @return Location 返回解析得到的车位位置对象
    public static Location getLocation() {
        // TODO: 实现逻辑以获取和解析车位位置信息
        String Floor = "1"; // 示例，默认值
        String Area = "A"; // 示例，默认值
        int Number = 1; // 示例，默认值
        return new Location(Floor, Area, Number);
    }
}
