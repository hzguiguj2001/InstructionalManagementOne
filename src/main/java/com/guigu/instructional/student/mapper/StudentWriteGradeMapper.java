package com.guigu.instructional.student.mapper;

import com.guigu.instructional.po.StudentWriteGrade;
import com.guigu.instructional.po.StudentWriteGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentWriteGradeMapper {
    int countByExample(StudentWriteGradeExample example);

    int deleteByExample(StudentWriteGradeExample example);

    int deleteByPrimaryKey(Integer writeGradeId);

    int insert(StudentWriteGrade record);

    int insertSelective(StudentWriteGrade record);

    List<StudentWriteGrade> selectByExample(StudentWriteGradeExample example);

    StudentWriteGrade selectByPrimaryKey(Integer writeGradeId);

    int updateByExampleSelective(@Param("record") StudentWriteGrade record, @Param("example") StudentWriteGradeExample example);

    int updateByExample(@Param("record") StudentWriteGrade record, @Param("example") StudentWriteGradeExample example);

    int updateByPrimaryKeySelective(StudentWriteGrade record);

    int updateByPrimaryKey(StudentWriteGrade record);
}