package com.java.lambda.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortListGroupOrderByName {
    public static void main(String[] args) {
        List<HolidayDTO> holidayList = new ArrayList<>();
        HolidayDTO dto = new HolidayDTO();
        dto.setActive(true);
        dto.setDescription("Leave");
        dto.setHolidayId(1L);
        dto.setStatus("PENDING");

        holidayList.add(dto);
     
        dto = new HolidayDTO();
        dto.setActive(true);
        dto.setDescription("Sunday Worked due to Build deployment.");
        dto.setHolidayId(2L);
        dto.setStatus("APPROVED");

        holidayList.add(dto);

        dto = new HolidayDTO();
        dto.setActive(true);
        dto.setDescription("Paid Leave");
        dto.setHolidayId(3L);
        dto.setStatus("APPROVED");

        holidayList.add(dto);

        dto = new HolidayDTO();
        dto.setActive(true);
        dto.setDescription("Bonus Leave");
        dto.setHolidayId(4L);
        dto.setStatus("REJECTED");

        holidayList.add(dto);

        dto = new HolidayDTO();
        dto.setActive(true);
        dto.setDescription("Second Saturday Paid Leave");
        dto.setHolidayId(6L);
        dto.setStatus("PENDING");

        holidayList.add(dto);

        dto = new HolidayDTO();
        dto.setActive(true);
        dto.setDescription("4th Saturday Paid Leave");
        dto.setHolidayId(5L);
        dto.setStatus("PENDING");

        holidayList.add(dto);

        System.out.println("Total Records: "+ holidayList.size());

        Stream<HolidayDTO> pendingList = holidayList.stream().filter(dtoStatus -> dtoStatus.getStatus().equals("PENDING")).sorted(Comparator.comparing(HolidayDTO::getHolidayId));

        Stream<HolidayDTO> approvedList = holidayList.stream().filter(dtoStatus -> dtoStatus.getStatus().equals("APPROVED")).sorted(Comparator.comparing(HolidayDTO::getHolidayId));

        Stream<HolidayDTO> rejectedList = holidayList.stream().filter(dtoStatus -> dtoStatus.getStatus().equals("REJECTED")).sorted(Comparator.comparing(HolidayDTO::getHolidayId));

        Stream<HolidayDTO> pendlingApprovedStream = Stream.concat(pendingList, approvedList);//Addling Stream to other Stream.

        List<HolidayDTO> sortedGroupList = Stream.concat(pendlingApprovedStream, rejectedList).collect(Collectors.toList());

        sortedGroupList.forEach(sortedData -> System.out.println(sortedData));
        
    }
}