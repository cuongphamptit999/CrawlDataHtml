/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.bk;

import vn.bk.config.Constant;
import vn.bk.controllers.MenuController;
import vn.bk.controllers.character.CharacterController;
import vn.bk.repositories.character.HistoricalCharacterRepository;
import vn.bk.services.character.CrawlHistoricalCharacter;
import vn.bk.services.dynasty.CrawlDynasty;
import vn.bk.services.event.CrawlHistoricalEvent;
import vn.bk.services.dynasty.CrawlDynasty;
/**
 *
 * @author cuongpham
 */
public class Main {

    public static void main(String[] args) {

        CrawlHistoricalCharacter crawlHistoricalCharacter = new CrawlHistoricalCharacter();
        CrawlHistoricalEvent crawlHistoricalEvent = new CrawlHistoricalEvent();
        CrawlDynasty crawlDynasty = new CrawlDynasty();

        MenuController menuController = new MenuController();
        menuController.setVisible(true);

    }

}
