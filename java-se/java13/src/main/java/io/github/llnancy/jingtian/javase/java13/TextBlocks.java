package io.github.llnancy.jingtian.javase.java13;

/**
 * text blocks
 *
 * @author llnancy admin@lilu.org.cn
 * @since JDK13 2023/7/18
 */
public class TextBlocks {

    public static void main(String[] args) {
        String json = "{\n" +
                "    \"title\":\"生态画卷这样绘就\",\n" +
                "    \"desc\":\"良好生态环境是最普惠的民生福祉。在习近平生态文明思想指引下，中国坚定不移走绿色发展之路，人与自然和谐共生的美丽中国，正在从蓝图变为现实。\",\n" +
                "    \"pic\":\"https://fyb-2.cdn.bcebos.com/hotboard_image/854d718b0b4577ce6a332019a7953cb2\",\n" +
                "    \"hot\":4911946,\n" +
                "    \"url\":\"https://www.baidu.com/s?wd=%E7%94%9F%E6%80%81%E7%94%BB%E5%8D%B7%E8%BF%99%E6%A0%B7%E7%BB%98%E5%B0%B1\",\n" +
                "    \"mobileUrl\":\"https://www.baidu.com/s?wd=%E7%94%9F%E6%80%81%E7%94%BB%E5%8D%B7%E8%BF%99%E6%A0%B7%E7%BB%98%E5%B0%B1&sa=fyb_news&rsv_dl=fyb_news\"\n" +
                "}";

        // 文本块
        String _json = """
                {
                    "title":"生态画卷这样绘就",
                    "desc":"良好生态环境是最普惠的民生福祉。在习近平生态文明思想指引下，中国坚定不移走绿色发展之路，人与自然和谐共生的美丽中国，正在从蓝图变为现实。",
                    "pic":"https://fyb-2.cdn.bcebos.com/hotboard_image/854d718b0b4577ce6a332019a7953cb2",
                    "hot":4911946,
                    "url":"https://www.baidu.com/s?wd=%E7%94%9F%E6%80%81%E7%94%BB%E5%8D%B7%E8%BF%99%E6%A0%B7%E7%BB%98%E5%B0%B1",
                    "mobileUrl":"https://www.baidu.com/s?wd=%E7%94%9F%E6%80%81%E7%94%BB%E5%8D%B7%E8%BF%99%E6%A0%B7%E7%BB%98%E5%B0%B1&sa=fyb_news&rsv_dl=fyb_news"
                }
                """;
    }
}
