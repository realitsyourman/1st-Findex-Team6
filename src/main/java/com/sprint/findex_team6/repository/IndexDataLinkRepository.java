package com.sprint.findex_team6.repository;

import com.sprint.findex_team6.entity.IndexDataLink;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndexDataLinkRepository extends JpaRepository<IndexDataLink, Long>,
    IndexDataLinkQuerydslRepository {

  @EntityGraph(attributePaths = {"index"})
  List<IndexDataLink> findByIndex_Id(Long indexId);

  @EntityGraph(attributePaths = {"index"})
  Optional<IndexDataLink> findFirstByIndex_IdAndTargetDate(Long index_id, LocalDate targetDate);

  @EntityGraph(attributePaths = {"index"})
  List<IndexDataLink> findByIndex_IdAndTargetDateIn(Long id, List<LocalDate> list);

}
