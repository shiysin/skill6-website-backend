package cn.skill6.website.service.home;

import cn.skill6.common.entity.po.article.ArticleInfo;
import cn.skill6.common.entity.vo.ResponseJson;
import cn.skill6.website.dao.intf.article.ArticleDao;
import cn.skill6.website.home.RecommendSvc;
import com.alibaba.dubbo.config.annotation.Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 推荐服务类
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-05 00:57
 */
@Slf4j
@Service
@Component
public class RecommendService implements RecommendSvc {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public ResponseJson getRecommendCarousel() {
        return null;
    }

    @Override
    public ResponseJson getRecommendVideo() {
        return null;
    }

    @Override
    public ResponseJson getRecommendDownload() {
        return null;
    }

    @Override
    public ResponseJson getRecommendQuestion() {
        return null;
    }

    @Override
    public ResponseJson getRecommendArticle() {
        ArticleInfo articleInfo = new ArticleInfo();
        List<ArticleInfo> articleInfos = articleDao.findByParams(articleInfo);

        return new ResponseJson(articleInfos);
    }
}
