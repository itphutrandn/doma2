package gradle.doma.controllers;

import gradle.doma.entity.Land;
import gradle.doma.services.LandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("lands")
public class LandController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LandService landService;

    @GetMapping("index")
    public List<Land> index() {
        return landService.getAll();
    }

    @GetMapping("selectJoin")
    public List<Land> selectJoin() {
        log.info("method call selectJoin");
        return landService.selectJoin();
    }

}
