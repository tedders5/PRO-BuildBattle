package me.drawe.buildbattle.objects;

import me.drawe.buildbattle.BuildBattle;
import me.drawe.buildbattle.managers.GameManager;
import net.md_5.bungee.api.ChatColor;
import sun.awt.image.BufferedImageDevice;

import java.sql.BatchUpdateException;

public enum Message {

    NOT_ENOUGH_PLAYERS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.not_enough_players")),
    GAME_STARTS_IN(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.game_starts_in")),
    GAME_ENDS_IN(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.game_ends_in")),
    TIMES_UP(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.times_up")),
    THEME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.theme")),
    PLAYER_JOINED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.player_joined")),
    PLAYER_LEFT(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.player_left")),
    ARENA_EXISTS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.arena_exists")),
    ARENA_NOT_EXISTS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.arena_not_exists")),
    NO_SELECTION(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.no_selection")),
    NOT_IN_PLOT(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.not_in_plot")),
    PLOT_REMOVED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.plot_removed")),
    NOT_IN_ARENA(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.not_in_arena")),
    ALREADY_IN_ARENA(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.already_in_arena")),
    ARENA_REMOVED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.arena_removed")),
    FLOOR_CHANGED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.floor_changed")),
    WEATHER_CHANGED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.weather_changed")),
    FLOOR_DENY_CHANGE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.floor_deny_change")),
    NOT_PLAYED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.not_played")),
    SCOREBOARD_TITLE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.in-game.title")),
    SCOREBOARD_TIME_LEFT(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.in-game.time_left")),
    SCOREBOARD_THEME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.in-game.theme")),
    SCOREBOARD_BUILDER(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.in-game.builder")),
    SCOREBOARD_YOUR_VOTE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.in-game.your_vote")),
    SCOREBOARD_PLAYERS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.in-game.players")),
    SCOREBOARD_MIN_PLAYERS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.in-game.min_players")),
    SCOREBOARD_SERVER(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.in-game.server")),
    SCOREBOARD_BUILDERS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.in-game.builders")),
    SCOREBOARD_TEAM_MODE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.in-game.team_mode")),
    SCOREBOARD_SOLO_MODE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.in-game.solo_mode")),
    SCOREBOARD_TEAMS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.in-game.teams")),
    SCOREBOARD_TEAMMATE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.in-game.teammate")),
    SCOREBOARD_STARTING_IN(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.in-game.starting_in")),
    SCOREBOARD_WAITING(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.in-game.waiting")),
    SCOREBOARD_MAIN_LOBBY_TITLE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.main-lobby.title")),
    SCOREBOARD_MAIN_LOBBY_PLAYED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.main-lobby.played")),
    SCOREBOARD_MAIN_LOBBY_WINS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.main-lobby.wins")),
    SCOREBOARD_MAIN_LOBBY_MOST_POINTS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.main-lobby.most_points")),
    SCOREBOARD_MAIN_LOBBY_BLOCKS_PLACED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.main-lobby.blocks_placed")),
    SCOREBOARD_MAIN_LOBBY_PARTICLES_PLACED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.main-lobby.particles_placed")),
    SCOREBOARD_MAIN_LOBBY_SERVER(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.main-lobby.server")),
    SCOREBOARD_MAIN_LOBBY_SUPER_VOTES(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("scoreboard.main-lobby.super_votes")),
    STATS_TITLE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("stats.title")),
    STATS_WINS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("stats.wins")),
    STATS_PLAYED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("stats.played")),
    STATS_MOST_POINTS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("stats.most_points")),
    STATS_SUPER_VOTES(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("stats.super_votes")),
    ARENA_FULL(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.arena_full")),
    ARENA_ALREADY_STARTED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.arena_already_started")),
    VOTE_CHANGED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.vote_changed")),
    VOTED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.voted")),
    ARENA_ENDED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.arena_ended")),
    STATS_BLOCKS_PLACED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("stats.blocks_placed")),
    CANT_BUILD_OUTSIDE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.cant_build")),
    COMMANDS_NOT_ALLOWED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.commands_not_allowed")),
    NO_EMPTY_ARENA(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.no_empty_arena")),
    YOU_PLACED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.you_placed")),
    VOTING_NONE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("voting.none")),
    VOTING_VERY_BAD(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("voting.very_bad")),
    VOTING_OK(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("voting.ok")),
    VOTING_BAD(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("voting.bad")),
    VOTING_NICE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("voting.nice")),
    VOTING_EPIC(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("voting.epic")),
    VOTING_LEGENDARY(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("voting.legendary")),
    RELOAD(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.server_reload")),
    ALL_ARENAS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.all_arenas")),
    FORCE_STOP(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.force_stop")),
    ARENA_NOT_RUNNING(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.arena_not_running")),
    CANT_VOTE_FOR_YOUR_PLOT(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.cant_vote_for_your_plot")),
    VOTE_TIME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.voting_ends")),
    MAX_PARTICLES(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.max_particles")),
    PARTICLE_REMOVED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.particle_removed")),
    CANT_PLACE_PARTICLE_OUTSIDE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.cant_place_particle")),
    STATS_PARTICLES_PLACED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("stats.particles_placed")),
    MOST_POINTS_ANNOUNCE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.most_points_announce")),
    MOST_POINTS_OLD(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.old_most_points")),
    MOST_POINTS_NEW(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.new_most_points")),
    TIME_CHANGED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.time_changed")),
    PLOT_CLEARED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.plot_cleared")),
    ARENA_LIST_STATUS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.arena_list.status")),
    ARENA_LIST_PLAYERS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.arena_list.players")),
    ARENA_LIST_CLICK_TO_JOIN(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.arena_list.join")),
    NO_PERMISSION(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.no_permission")),
    THANKS_FOR_PLAYING(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.thanks_for_playing")),
    YOUR_POSITION(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.your_position")),
    TIME_YEARS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("time.years")),
    TIME_DAYS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("time.days")),
    TIME_HOURS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("time.hours")),
    TIME_MINUTES(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("time.minutes")),
    TIME_YEAR(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("time.year")),
    TIME_DAY(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("time.day")),
    TIME_HOUR(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("time.hour")),
    TIME_MINUTE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("time.minute")),
    TITLE_VOTING(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.voting")),
    SUBTITLE_VOTING(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.prepare_vote")),
    TIME_SECONDS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("time.seconds")),
    TIME_SECOND(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("time.second")),
    LINE_SPACER(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.line_spacer")),
    CANT_LEAVE_PLOT(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.cant_leave_plot")),
    NO_PLAYERS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.no_players")),
    MOTD_LOBBY(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("motd.lobby")),
    MOTD_INGAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("motd.ingame")),
    MOTD_VOTING(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("motd.voting")),
    MOTD_ENDING(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("motd.ending")),
    BIOME_CHANGED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.biome_changed")),
    CANNOT_WEAR_ARMOR(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.cant_wear_equipment")),
    CANNOT_SET_THEME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.cannot_set_theme")),
    REPORT_SUCCESS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.report_success")),
    ALREADY_REPOTED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.already_reported")),
    REPORT_FAILED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.report_failed")),
    CANNOT_REPORT_YOURSELF(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.cant_report_yourself")),
    VOTING_BUILDER(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("voting.builder")),
    SIGN_JOIN_FIRST_LINE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("signs.join.first_line")),
    SIGN_JOIN_SECOND_LINE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("signs.join.second_line")),
    SIGN_JOIN_THIRD_LINE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("signs.join.third_line")),
    SIGN_JOIN_FOURTH_LINE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("signs.join.fourth_line")),
    SIGN_AUTO_JOIN_FIRST_LINE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("signs.auto-join.first_line")),
    SIGN_AUTO_JOIN_SECOND_LINE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("signs.auto-join.second_line")),
    SIGN_AUTO_JOIN_THIRD_LINE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("signs.auto-join.third_line")),
    SIGN_AUTO_JOIN_FOURTH_LINE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("signs.auto-join.fourth_line")),
    ITEMS_LEAVE_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("items.leave_item.displayname")),
    ITEMS_REPORT_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("items.report_item.displayname")),
    ITEMS_OPTIONS_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("items.options_item.displayname")),
    GUI_OPTIONS_TITLE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.options.title")),
    GUI_OPTIONS_HEADS_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.options.items.heads_item.displayname")),
    GUI_OPTIONS_CHANGE_FLOOR_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.options.items.change_floor_item.displayname")),
    GUI_OPTIONS_CHANGE_TIME_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.options.items.time_item.displayname")),
    GUI_OPTIONS_PARTICLES_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.options.items.particles_item.displayname")),
    GUI_OPTIONS_PARTICLE_LIST_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.options.items.particle_list_item.displayname")),
    GUI_OPTIONS_CLEAR_PLOT_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.options.items.clear_plot_item.displayname")),
    GUI_OPTIONS_CHANGE_WEATHER_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.options.items.change_weather_item.displayname")),
    GUI_PARTICLES_TITLE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.particles.title")),
    GUI_TIME_TITLE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.time.title")),
    GUI_TIME_MORNING_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.time.items.morning.displayname")),
    GUI_TIME_MIDMORNING_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.time.items.mid_morning.displayname")),
    GUI_TIME_NOON_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.time.items.noon.displayname")),
    GUI_TIME_AFTERNOON_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.time.items.afternoon.displayname")),
    GUI_TIME_EVENING_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.time.items.evening.displayname")),
    GUI_TIME_NIGHT_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.time.items.night.displayname")),
    GUI_TIME_MIDNIGHT_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.time.items.midnight.displayname")),
    GUI_TIME_AFTERMIDNIGHT_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.time.items.after_midnight.displayname")),
    GUI_HEADS_TITLE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.heads.title")),
    GUI_HEADS_PREV_PAGE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.heads.items.previous_page")),
    GUI_HEADS_NEXT_PAGE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.heads.items.next_page")),
    GUI_HEADS_MAIN_PAGE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.heads.items.main_page")),
    GUI_THEME_VOTING_TITLE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.theme_voting.title")),
    GUI_THEME_VOTING_INVENTORY_THEMES_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.theme_voting.themes.displayname")),
    GUI_THEME_VOTING_INVENTORY_SUPER_VOTE_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.theme_voting.supervote_item.displayname")),
    GUI_ARENA_LIST_TITLE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.arena_list.title")),
    GUI_ARENA_LIST_STATUS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.arena_list.status")),
    GUI_ARENA_LIST_PLAYERS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.arena_list.players")),
    GUI_ARENA_LIST_CLICK_TO_JOIN(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.arena_list.join")),
    GUI_PARTICLE_LIST_TITLE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.particle_list.title")),
    GUI_PARTICLE_LIST_ITEMS_LOCATION(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.particle_list.items.location")),
    GUI_PARTICLE_LIST_ITEMS_CLICK_TO_REMOVE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.particle_list.items.click_to_remove")),
    GAMESTATE_LOBBY(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gamestate.lobby")),
    GAMESTATE_THEME_VOTING(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gamestate.theme_voting")),
    GAMESTATE_INGAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gamestate.ingame")),
    GAMESTATE_VOTING(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gamestate.voting")),
    GAMESTATE_ENDING(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gamestate.ending")),
    LEADERBOARDS_WINS_TITLE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("leaderboards.wins.title")),
    LEADERBOARDS_WINS_FORMAT(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("leaderboards.wins.format")),
    LEADERBOARDS_PLAYED_TITLE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("leaderboards.played.title")),
    LEADERBOARDS_PLAYED_FORMAT(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("leaderboards.played.format")),
    LEADERBOARDS_BLOCKS_PLACED_TITLE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("leaderboards.blocks_placed.title")),
    LEADERBOARDS_BLOCKS_PLACED_FORMAT(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("leaderboards.blocks_placed.format")),
    LEADERBOARDS_PARTICLES_PLACED_TITLE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("leaderboards.particles_placed.title")),
    LEADERBOARDS_PARTICLES_PLACED_FORMAT(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("leaderboards.particles_placed.format")),
    CHANGE_FLOOR_NPC_NAME(BuildBattle.getFileManager().getConfig("config.yml").get().getString("change_floor_npc.name")),
    GAMEMODE_TEAMS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gamemode.team")),
    GAMEMODE_SOLO(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gamemode.solo")),
    VOTING_BUILDERS(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("voting.builders")),
    YOU_JOINED_TEAM(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.you_joined_team")),
    YOU_LEFT_TEAM(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.you_left_team")),
    YOUR_TEAMMATE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.your_teammate")),
    GUI_TEAMS_TITLE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.teams.title")),
    ITEMS_TEAMS_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("items.teams_item.displayname")),
    TEAM_IS_FULL(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.team_is_full")),
    PARTY_JOIN(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_join")),
    PARTY_LEFT(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_leave")),
    PARTY_ALREADY_INVITED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_already_invited")),
    PARTY_INVITE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_invite")),
    PARTY_INVITE_EXPIRED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_invite_expired")),
    PARTY_CREATED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_created")),
    PARTY_DISBANDED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_disband")),
    PARTY_ALREADY_IN_PARTY(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_already_in_party")),
    PARTY_CREATE_FAILED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_create_failed")),
    PARTY_NO_PENDING_INVITES(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_no_pending_invites")),
    PARTY_INVITE_DECLINE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_invite_decline")),
    PARTY_NOT_IN_PARTY(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_not_in_party")),
    PARTY_INVALID_USAGE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_invalid_usage")),
    PARTY_PLAYER_NOT_ONLINE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_player_not_online")),
    PARTY_NOT_ALLOWED_TO_INVITE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_not_allowed_to_invite")),
    PARTY_PLAYER_JOINED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_player_joined")),
    PARTY_PLAYER_LEFT(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_player_left")),
    PARTY_NO_SPACE_FOR_YOUR_PARTY(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_arena_full")),
    PARTY_YOU_HAVE_BEEN_INVITED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_you_have_been_invited")),
    PARTY_ACCEPT_INFO(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_accept_info")),
    PARTY_DECLINE_INFO(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_decline_info")),
    PARTIES_NOT_ALLOWED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_not_allowed")),
    PARTY_FULL(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_full")),
    ALREADY_IN_THAT_TEAM(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.already_in_that_team")),
    GUI_TEAMS_ITEMS_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.teams.items.displayname")),
    GUI_TEAM_ITEMS_NOBODY(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.teams.items.nobody")),
    ARENA_LIST_MODE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.arena_list.mode")),
    ITEMS_BACK_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("items.back_item.displayname")),
    GUI_BIOMES_PLAINS_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.biomes.items.plains.displayname")),
    GUI_BIOMES_MESA_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.biomes.items.mesa.displayname")),
    GUI_BIOMES_OCEAN_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.biomes.items.ocean.displayname")),
    GUI_BIOMES_DESERT_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.biomes.items.desert.displayname")),
    GUI_BIOMES_FOREST_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.biomes.items.forest.displayname")),
    GUI_BIOMES_JUNGLE_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.biomes.items.jungle.displayname")),
    GUI_BIOMES_SWAMP_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.biomes.items.swamp.displayname")),
    GUI_BIOMES_SAVANNA_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.biomes.items.savanna.displayname")),
    GUI_OPTIONS_PLOT_BIOME_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.options.items.change_biome_item.displayname")),
    GUI_BIOMES_TITLE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.biomes.title")),
    ITEMS_BANNER_CREATOR_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.options.items.banner_creator_item.displayname")),
    GUI_COLORS_TITLE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.colors.title")),
    GUI_PATTERNS_TITLE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.patterns.title")),
    FINAL_BANNER_ITEM_DISPLAYNAME(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.banner_creator.items.final_banner.displayname")),
    THEME_BLACKLISTED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.theme_blacklisted")),
    KICKED_DUE_TO_VIP_JOIN(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.kicked_due_vip_join")),
    NO_VIP_SLOT_FREE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.no_vip_slot_free")),
    UNABLE_TO_JOIN(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.unable_to_join")),
    ORDINAL_ST(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("ordinals.st")),
    ORDINAL_ND(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("ordinals.nd")),
    ORDINAL_RD(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("ordinals.rd")),
    ORDINAL_TH(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("ordinals.th")),
    GUI_ARENA_LIST_SOLO_TITLE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.arena_list.solo_title")),
    GUI_ARENA_LIST_TEAM_TITLE(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("gui.arena_list.team_title")),
    NOT_ENOUGH_SUPER_VOTES(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.not_enough_super_votes")),
    THEME_WAS_SUPER_VOTED(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.theme_was_super_voted")),
    PARTY_CANT_INVITE_YOURSELF(BuildBattle.getFileManager().getConfig("messages.yml").get().getString("messages.party_cant_invite_yourself"));
    private String message;
    Message(String message) {
        this.message = ChatColor.translateAlternateColorCodes('&', message);
    }

    public String getChatMessage() {
        return GameManager.getPrefix() + " " + message;
    }

    public String getMessage() {
        return message;
    }
}
