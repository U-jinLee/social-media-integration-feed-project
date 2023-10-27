package com.example.socialmediafeed.domain.statistics.controller;

import com.example.socialmediafeed.domain.statistics.dto.StatisticsResponseDto;
import com.example.socialmediafeed.domain.statistics.service.StatisticsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/// 통계 관련 API
@Controller
@RequestMapping("/statistics")
@RequiredArgsConstructor
public class StatisticsController {

    private final StatisticsService statisticsService;

    /**
     * 통계 반환 메서드
     * @param hasthag
     * @param type
     * @param start
     * @param end
     * @param value
     * @return List<StatisticsResponseDto>
     */
    @GetMapping
    @ResponseBody
    public List<StatisticsResponseDto> getStatistics (
            @RequestParam(required = false) String hasthag,
            @RequestParam String type, // date, hour 둘 중 하나
            @RequestParam(required = false) Date start,
            @RequestParam(required = false) Date end,
            @RequestParam(required = false) String value) {
        return statisticsService.getStatistics();
    }
}