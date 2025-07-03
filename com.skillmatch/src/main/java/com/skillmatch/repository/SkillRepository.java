package com.skillmatch.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skillmatch.entity.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long>{
	Optional<Skill> findByName(String name);
}
