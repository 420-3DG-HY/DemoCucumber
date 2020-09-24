Feature: Recherche sur Google

  Scenario: Trouver le cégep de Saint-Hyacinthe
    Given La page de "https://google.ca" est ouverte
    When Je lance une recherche avec "cégep de Saint-Hyacinthe"
    Then Je trouve le site "www.cegepsth.qc.ca"
