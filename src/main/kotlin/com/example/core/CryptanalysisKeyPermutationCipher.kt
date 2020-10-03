package com.example.core

class CryptanalysisKeyPermutationCipher {
    companion object {
    var bigramm = mapOf(
            "__" to 0,
            "_Ы" to 0,
            "_Ь" to 0,
            "АА" to 2,
            "АБ" to 12,
            "АВ" to 35,
            "АГ" to 8,
            "АД" to 14,
            "АЕ" to 7,
            "АЖ" to 6,
            "АЗ" to 15,
            "АИ" to 7,
            "АЙ" to 7,
            "АК" to 19,
            "АЛ" to 27,
            "АМ" to 19,
            "АН" to 45,
            "АО" to 5,
            "АП" to 11,
            "АР" to 26,
            "АС" to 31,
            "АТ" to 27,
            "АУ" to 3,
            "АФ" to 1,
            "АХ" to 10,
            "АЦ" to 6,
            "АЧ" to 7,
            "АШ" to 10,
            "АЩ" to 1,
            "АЫ" to 0,
            "АЬ" to 0,
            "АЭ" to 2,
            "АЮ" to 6,
            "АЯ" to 9,
            "БА" to 5,
            "ББ" to 0,
            "БВ" to 0,
            "БГ" to 0,
            "БД" to 0,
            "БЕ" to 9,
            "БЖ" to 1,
            "БЗ" to 0,
            "БИ" to 6,
            "БЙ" to 0,
            "БК" to 0,
            "БЛ" to 6,
            "БМ" to 0,
            "БН" to 2,
            "БО" to 21,
            "БП" to 0,
            "БР" to 8,
            "БС" to 1,
            "БТ" to 0,
            "БУ" to 6,
            "БФ" to 0,
            "БХ" to 0,
            "БЦ" to 0,
            "БЧ" to 0,
            "БШ" to 0,
            "БЩ" to 1,
            "БЫ" to 11,
            "БЬ" to 0,
            "БЭ" to 0,
            "БЮ" to 0,
            "БЯ" to 2,
            "ВА" to 35,
            "ВБ" to 1,
            "ВВ" to 5,
            "ВГ" to 3,
            "ВД" to 3,
            "ВЕ" to 32,
            "ВЖ" to 0,
            "ВЗ" to 2,
            "ВИ" to 17,
            "ВЙ" to 0,
            "ВК" to 7,
            "ВЛ" to 10,
            "ВМ" to 3,
            "ВН" to 9,
            "ВО" to 58,
            "ВП" to 6,
            "ВР" to 6,
            "ВС" to 19,
            "ВТ" to 6,
            "ВУ" to 7,
            "ВФ" to 0,
            "ВХ" to 1,
            "ВЦ" to 1,
            "ВЧ" to 2,
            "ВШ" to 4,
            "ВЩ" to 1,
            "ВЫ" to 18,
            "ВЬ" to 1,
            "ВЭ" to 2,
            "ВЮ" to 0,
            "ВЯ" to 3,
            "ГА" to 7,
            "ГБ" to 0,
            "ГВ" to 0,
            "ГГ" to 0,
            "ГД" to 3,
            "ГЕ" to 3,
            "ГЖ" to 0,
            "ГЗ" to 0,
            "ГИ" to 5,
            "ГЙ" to 0,
            "ГК" to 1,
            "ГЛ" to 5,
            "ГМ" to 0,
            "ГН" to 1,
            "ГО" to 50,
            "ГП" to 0,
            "ГР" to 7,
            "ГС" to 0,
            "ГТ" to 0,
            "ГУ" to 2,
            "ГФ" to 0,
            "ГХ" to 0,
            "ГЦ" to 0,
            "ГЧ" to 0,
            "ГШ" to 0,
            "ГЩ" to 0,
            "ГЫ" to 0,
            "ГЬ" to 0,
            "ГЭ" to 0,
            "ГЮ" to 0,
            "ГЯ" to 0,
            "ДА" to 25,
            "ДБ" to 0,
            "ДВ" to 3,
            "ДГ" to 1,
            "ДД" to 1,
            "ДЕ" to 29,
            "ДЖ" to 1,
            "ДЗ" to 1,
            "ДИ" to 13,
            "ДЙ" to 0,
            "ДК" to 1,
            "ДЛ" to 5,
            "ДМ" to 1,
            "ДН" to 13,
            "ДО" to 22,
            "ДП" to 3,
            "ДР" to 6,
            "ДС" to 8,
            "ДТ" to 1,
            "ДУ" to 10,
            "ДФ" to 0,
            "ДХ" to 0,
            "ДЦ" to 1,
            "ДЧ" to 1,
            "ДШ" to 1,
            "ДЩ" to 0,
            "ДЫ" to 5,
            "ДЬ" to 1,
            "ДЭ" to 0,
            "ДЮ" to 0,
            "ДЯ" to 1,
            "ЕА" to 2,
            "ЕБ" to 9,
            "ЕВ" to 18,
            "ЕГ" to 11,
            "ЕД" to 27,
            "ЕЕ" to 7,
            "ЕЖ" to 5,
            "ЕЗ" to 10,
            "ЕИ" to 6,
            "ЕЙ" to 15,
            "ЕК" to 13,
            "ЕЛ" to 35,
            "ЕМ" to 24,
            "ЕН" to 63,
            "ЕО" to 7,
            "ЕП" to 16,
            "ЕР" to 39,
            "ЕС" to 37,
            "ЕТ" to 33,
            "ЕУ" to 3,
            "ЕФ" to 1,
            "ЕХ" to 8,
            "ЕЦ" to 3,
            "ЕЧ" to 7,
            "ЕШ" to 3,
            "ЕЩ" to 3,
            "ЕЫ" to 0,
            "ЕЬ" to 0,
            "ЕЭ" to 1,
            "ЕЮ" to 1,
            "ЕЯ" to 2,
            "ЖА" to 5,
            "ЖБ" to 1,
            "ЖВ" to 0,
            "ЖГ" to 0,
            "ЖД" to 6,
            "ЖЕ" to 12,
            "ЖЖ" to 0,
            "ЖЗ" to 0,
            "ЖИ" to 5,
            "ЖЙ" to 0,
            "ЖК" to 0,
            "ЖЛ" to 0,
            "ЖМ" to 0,
            "ЖН" to 6,
            "ЖО" to 0,
            "ЖП" to 0,
            "ЖР" to 0,
            "ЖС" to 1,
            "ЖТ" to 0,
            "ЖУ" to 1,
            "ЖФ" to 0,
            "ЖХ" to 0,
            "ЖЦ" to 0,
            "ЖЧ" to 0,
            "ЖШ" to 0,
            "ЖЩ" to 0,
            "ЖЫ" to 0,
            "ЖЬ" to 0,
            "ЖЭ" to 0,
            "ЖЮ" to 0,
            "ЖЯ" to 0,
            "ЗА" to 35,
            "ЗБ" to 1,
            "ЗВ" to 7,
            "ЗГ" to 1,
            "ЗД" to 5,
            "ЗЕ" to 3,
            "ЗЖ" to 0,
            "ЗЗ" to 0,
            "ЗИ" to 4,
            "ЗЙ" to 0,
            "ЗК" to 2,
            "ЗЛ" to 1,
            "ЗМ" to 2,
            "ЗН" to 9,
            "ЗО" to 9,
            "ЗП" to 1,
            "ЗР" to 3,
            "ЗС" to 1,
            "ЗТ" to 0,
            "ЗУ" to 2,
            "ЗФ" to 0,
            "ЗХ" to 0,
            "ЗЦ" to 0,
            "ЗЧ" to 0,
            "ЗШ" to 0,
            "ЗЩ" to 0,
            "ЗЫ" to 4,
            "ЗЬ" to 0,
            "ЗЭ" to 0,
            "ЗЮ" to 0,
            "ЗЯ" to 4,
            "ИА" to 4,
            "ИБ" to 6,
            "ИВ" to 22,
            "ИГ" to 5,
            "ИД" to 10,
            "ИЕ" to 21,
            "ИЖ" to 2,
            "ИЗ" to 23,
            "ИИ" to 19,
            "ИЙ" to 11,
            "ИК" to 19,
            "ИЛ" to 21,
            "ИМ" to 20,
            "ИН" to 32,
            "ИО" to 8,
            "ИП" to 13,
            "ИР" to 11,
            "ИС" to 29,
            "ИТ" to 29,
            "ИУ" to 3,
            "ИФ" to 1,
            "ИХ" to 17,
            "ИЦ" to 3,
            "ИЧ" to 11,
            "ИШ" to 1,
            "ИЩ" to 1,
            "ИЫ" to 0,
            "ИЬ" to 0,
            "ИЭ" to 1,
            "ИЮ" to 3,
            "ИЯ" to 17,
            "ЙА" to 1,
            "ЙБ" to 1,
            "ЙВ" to 4,
            "ЙГ" to 1,
            "ЙД" to 3,
            "ЙЕ" to 0,
            "ЙЖ" to 1,
            "ЙЗ" to 2,
            "ЙИ" to 4,
            "ЙЙ" to 0,
            "ЙК" to 5,
            "ЙЛ" to 1,
            "ЙМ" to 2,
            "ЙН" to 7,
            "ЙО" to 9,
            "ЙП" to 7,
            "ЙР" to 3,
            "ЙС" to 10,
            "ЙТ" to 2,
            "ЙУ" to 0,
            "ЙФ" to 0,
            "ЙХ" to 0,
            "ЙЦ" to 1,
            "ЙЧ" to 3,
            "ЙШ" to 2,
            "ЙЩ" to 0,
            "ЙЫ" to 0,
            "ЙЬ" to 0,
            "ЙЭ" to 0,
            "ЙЮ" to 0,
            "ЙЯ" to 0,
            "КА" to 24,
            "КБ" to 1,
            "КВ" to 4,
            "КГ" to 1,
            "КД" to 0,
            "КЕ" to 4,
            "КЖ" to 1,
            "КЗ" to 1,
            "КИ" to 26,
            "КЙ" to 0,
            "КК" to 1,
            "КЛ" to 4,
            "КМ" to 1,
            "КН" to 2,
            "КО" to 66,
            "КП" to 2,
            "КР" to 10,
            "КС" to 3,
            "КТ" to 7,
            "КУ" to 10,
            "КФ" to 0,
            "КХ" to 0,
            "КЦ" to 1,
            "КЧ" to 0,
            "КШ" to 0,
            "КЩ" to 0,
            "КЫ" to 0,
            "КЬ" to 0,
            "КЭ" to 0,
            "КЮ" to 0,
            "КЯ" to 0,
            "ЛА" to 25,
            "ЛБ" to 1,
            "ЛВ" to 1,
            "ЛГ" to 1,
            "ЛД" to 1,
            "ЛЕ" to 33,
            "ЛЖ" to 2,
            "ЛЗ" to 1,
            "ЛИ" to 36,
            "ЛЙ" to 0,
            "ЛК" to 1,
            "ЛЛ" to 2,
            "ЛМ" to 1,
            "ЛН" to 8,
            "ЛО" to 30,
            "ЛП" to 2,
            "ЛР" to 0,
            "ЛС" to 3,
            "ЛТ" to 1,
            "ЛУ" to 6,
            "ЛФ" to 0,
            "ЛХ" to 4,
            "ЛЦ" to 0,
            "ЛЧ" to 1,
            "ЛШ" to 0,
            "ЛЩ" to 0,
            "ЛЫ" to 3,
            "ЛЬ" to 20,
            "ЛЭ" to 0,
            "ЛЮ" to 4,
            "ЛЯ" to 9,
            "МА" to 18,
            "МБ" to 2,
            "МВ" to 4,
            "МГ" to 1,
            "МД" to 1,
            "МЕ" to 21,
            "МЖ" to 1,
            "МЗ" to 2,
            "МИ" to 23,
            "МЙ" to 0,
            "МК" to 3,
            "МЛ" to 1,
            "ММ" to 3,
            "МН" to 7,
            "МО" to 19,
            "МП" to 5,
            "МР" to 2,
            "МС" to 5,
            "МТ" to 3,
            "МУ" to 9,
            "МФ" to 1,
            "МХ" to 0,
            "МЦ" to 0,
            "МЧ" to 2,
            "МШ" to 0,
            "МЩ" to 0,
            "МЫ" to 5,
            "МЬ" to 1,
            "МЭ" to 1,
            "МЮ" to 0,
            "МЯ" to 3,
            "НА" to 54,
            "НБ" to 1,
            "НВ" to 2,
            "НГ" to 3,
            "НД" to 3,
            "НЕ" to 34,
            "НЖ" to 0,
            "НЗ" to 0,
            "НИ" to 58,
            "НЙ" to 0,
            "НК" to 3,
            "НЛ" to 0,
            "НМ" to 1,
            "НН" to 24,
            "НО" to 67,
            "НП" to 2,
            "НР" to 1,
            "НС" to 9,
            "НТ" to 9,
            "НУ" to 7,
            "НФ" to 1,
            "НХ" to 0,
            "НЦ" to 5,
            "НЧ" to 2,
            "НШ" to 0,
            "НЩ" to 0,
            "НЫ" to 36,
            "НЬ" to 3,
            "НЭ" to 0,
            "НЮ" to 0,
            "НЯ" to 5,
            "ОА" to 1,
            "ОБ" to 28,
            "ОВ" to 84,
            "ОГ" to 32,
            "ОД" to 47,
            "ОЕ" to 15,
            "ОЖ" to 7,
            "ОЗ" to 18,
            "ОИ" to 12,
            "ОЙ" to 29,
            "ОК" to 19,
            "ОЛ" to 41,
            "ОМ" to 38,
            "ОН" to 30,
            "ОО" to 9,
            "ОП" to 18,
            "ОР" to 43,
            "ОС" to 50,
            "ОТ" to 39,
            "ОУ" to 3,
            "ОФ" to 2,
            "ОХ" to 5,
            "ОЦ" to 2,
            "ОЧ" to 12,
            "ОШ" to 4,
            "ОЩ" to 3,
            "ОЫ" to 0,
            "ОЬ" to 0,
            "ОЭ" to 2,
            "ОЮ" to 3,
            "ОЯ" to 2,
            "ПА" to 7,
            "ПБ" to 0,
            "ПВ" to 0,
            "ПГ" to 0,
            "ПД" to 0,
            "ПЕ" to 15,
            "ПЖ" to 0,
            "ПЗ" to 0,
            "ПИ" to 4,
            "ПЙ" to 0,
            "ПК" to 0,
            "ПЛ" to 9,
            "ПМ" to 0,
            "ПН" to 1,
            "ПО" to 46,
            "ПП" to 0,
            "ПР" to 41,
            "ПС" to 1,
            "ПТ" to 1,
            "ПУ" to 6,
            "ПФ" to 0,
            "ПХ" to 0,
            "ПЦ" to 0,
            "ПЧ" to 0,
            "ПШ" to 0,
            "ПЩ" to 0,
            "ПЫ" to 2,
            "ПЬ" to 0,
            "ПЭ" to 0,
            "ПЮ" to 0,
            "ПЯ" to 2,
            "РА" to 55,
            "РБ" to 1,
            "РВ" to 4,
            "РГ" to 4,
            "РД" to 3,
            "РЕ" to 37,
            "РЖ" to 3,
            "РЗ" to 1,
            "РИ" to 24,
            "РЙ" to 0,
            "РК" to 3,
            "РЛ" to 1,
            "РМ" to 3,
            "РН" to 7,
            "РО" to 56,
            "РП" to 2,
            "РР" to 1,
            "РС" to 5,
            "РТ" to 9,
            "РУ" to 16,
            "РФ" to 0,
            "РХ" to 1,
            "РЦ" to 1,
            "РЧ" to 1,
            "РШ" to 2,
            "РЩ" to 0,
            "РЫ" to 8,
            "РЬ" to 3,
            "РЭ" to 0,
            "РЮ" to 0,
            "РЯ" to 5,
            "СА" to 8,
            "СБ" to 1,
            "СВ" to 7,
            "СГ" to 1,
            "СД" to 2,
            "СЕ" to 25,
            "СЖ" to 0,
            "СЗ" to 0,
            "СИ" to 6,
            "СЙ" to 0,
            "СК" to 40,
            "СЛ" to 13,
            "СМ" to 3,
            "СН" to 9,
            "СО" to 27,
            "СП" to 11,
            "СР" to 4,
            "СС" to 11,
            "СТ" to 82,
            "СУ" to 6,
            "СФ" to 0,
            "СХ" to 1,
            "СЦ" to 1,
            "СЧ" to 2,
            "СШ" to 2,
            "СЩ" to 0,
            "СЫ" to 1,
            "СЬ" to 8,
            "СЭ" to 0,
            "СЮ" to 0,
            "СЯ" to 17,
            "ТА" to 35,
            "ТБ" to 1,
            "ТВ" to 27,
            "ТГ" to 1,
            "ТД" to 3,
            "ТЕ" to 31,
            "ТЖ" to 0,
            "ТЗ" to 1,
            "ТИ" to 28,
            "ТЙ" to 0,
            "ТК" to 5,
            "ТЛ" to 1,
            "ТМ" to 1,
            "ТН" to 11,
            "ТО" to 56,
            "ТП" to 4,
            "ТР" to 26,
            "ТС" to 18,
            "ТТ" to 2,
            "ТУ" to 10,
            "ТФ" to 0,
            "ТХ" to 0,
            "ТЦ" to 0,
            "ТЧ" to 1,
            "ТШ" to 0,
            "ТЩ" to 0,
            "ТЫ" to 11,
            "ТЬ" to 21,
            "ТЭ" to 0,
            "ТЮ" to 0,
            "ТЯ" to 4,
            "УА" to 1,
            "УБ" to 4,
            "УВ" to 4,
            "УГ" to 4,
            "УД" to 11,
            "УЕ" to 2,
            "УЖ" to 6,
            "УЗ" to 3,
            "УИ" to 2,
            "УЙ" to 0,
            "УК" to 8,
            "УЛ" to 5,
            "УМ" to 5,
            "УН" to 5,
            "УО" to 1,
            "УП" to 5,
            "УР" to 7,
            "УС" to 14,
            "УТ" to 7,
            "УУ" to 0,
            "УФ" to 0,
            "УХ" to 1,
            "УЦ" to 0,
            "УЧ" to 8,
            "УШ" to 3,
            "УЩ" to 2,
            "УЫ" to 0,
            "УЬ" to 0,
            "УЭ" to 0,
            "УЮ" to 9,
            "УЯ" to 1,
            "ФА" to 2,
            "ФБ" to 0,
            "ФВ" to 0,
            "ФГ" to 0,
            "ФД" to 0,
            "ФЕ" to 2,
            "ФЖ" to 0,
            "ФЗ" to 0,
            "ФИ" to 2,
            "ФЙ" to 0,
            "ФК" to 0,
            "ФЛ" to 0,
            "ФМ" to 0,
            "ФН" to 0,
            "ФО" to 1,
            "ФП" to 0,
            "ФР" to 1,
            "ФС" to 1,
            "ФТ" to 0,
            "ФУ" to 0,
            "ФФ" to 0,
            "ФХ" to 0,
            "ФЦ" to 0,
            "ФЧ" to 0,
            "ФШ" to 0,
            "ФЩ" to 0,
            "ФЫ" to 0,
            "ФЬ" to 0,
            "ФЭ" to 0,
            "ФЮ" to 0,
            "ФЯ" to 0,
            "ХА" to 4,
            "ХБ" to 1,
            "ХВ" to 4,
            "ХГ" to 1,
            "ХД" to 3,
            "ХЕ" to 1,
            "ХЖ" to 0,
            "ХЗ" to 2,
            "ХИ" to 3,
            "ХЙ" to 0,
            "ХК" to 4,
            "ХЛ" to 3,
            "ХМ" to 3,
            "ХН" to 4,
            "ХО" to 18,
            "ХП" to 5,
            "ХР" to 3,
            "ХС" to 4,
            "ХТ" to 2,
            "ХУ" to 2,
            "ХФ" to 1,
            "ХХ" to 0,
            "ХЦ" to 0,
            "ХЧ" to 1,
            "ХШ" to 0,
            "ХЩ" to 0,
            "ХЫ" to 0,
            "ХЬ" to 0,
            "ХЭ" to 0,
            "ХЮ" to 0,
            "ХЯ" to 0,
            "ЦА" to 3,
            "ЦБ" to 0,
            "ЦВ" to 1,
            "ЦГ" to 0,
            "ЦД" to 0,
            "ЦЕ" to 7,
            "ЦЖ" to 0,
            "ЦЗ" to 0,
            "ЦИ" to 10,
            "ЦЙ" to 0,
            "ЦК" to 2,
            "ЦЛ" to 0,
            "ЦМ" to 0,
            "ЦН" to 0,
            "ЦО" to 1,
            "ЦП" to 0,
            "ЦР" to 0,
            "ЦС" to 0,
            "ЦТ" to 0,
            "ЦУ" to 1,
            "ЦФ" to 0,
            "ЦХ" to 0,
            "ЦЦ" to 0,
            "ЦЧ" to 0,
            "ЦШ" to 0,
            "ЦЩ" to 0,
            "ЦЫ" to 1,
            "ЦЬ" to 0,
            "ЦЭ" to 0,
            "ЦЮ" to 0,
            "ЦЯ" to 0,
            "ЧА" to 12,
            "ЧБ" to 0,
            "ЧВ" to 0,
            "ЧГ" to 0,
            "ЧД" to 0,
            "ЧЕ" to 23,
            "ЧЖ" to 0,
            "ЧЗ" to 0,
            "ЧИ" to 13,
            "ЧЙ" to 0,
            "ЧК" to 2,
            "ЧЛ" to 0,
            "ЧМ" to 0,
            "ЧН" to 6,
            "ЧО" to 0,
            "ЧП" to 0,
            "ЧР" to 0,
            "ЧС" to 0,
            "ЧТ" to 7,
            "ЧУ" to 1,
            "ЧФ" to 0,
            "ЧХ" to 0,
            "ЧЦ" to 0,
            "ЧЧ" to 0,
            "ЧШ" to 1,
            "ЧЩ" to 0,
            "ЧЫ" to 0,
            "ЧЬ" to 1,
            "ЧЭ" to 0,
            "ЧЮ" to 0,
            "ЧЯ" to 0,
            "ША" to 5,
            "ШБ" to 0,
            "ШВ" to 0,
            "ШГ" to 0,
            "ШД" to 0,
            "ШЕ" to 11,
            "ШЖ" to 0,
            "ШЗ" to 0,
            "ШИ" to 14,
            "ШЙ" to 0,
            "ШК" to 1,
            "ШЛ" to 2,
            "ШМ" to 0,
            "ШН" to 2,
            "ШО" to 2,
            "ШП" to 0,
            "ШР" to 0,
            "ШС" to 0,
            "ШТ" to 0,
            "ШУ" to 1,
            "ШФ" to 0,
            "ШХ" to 0,
            "ШЦ" to 0,
            "ШЧ" to 0,
            "ШШ" to 0,
            "ШЩ" to 0,
            "ШЫ" to 0,
            "ШЬ" to 1,
            "ШЭ" to 0,
            "ШЮ" to 0,
            "ШЯ" to 0,
            "ЩА" to 3,
            "ЩБ" to 0,
            "ЩВ" to 0,
            "ЩГ" to 0,
            "ЩД" to 0,
            "ЩЕ" to 8,
            "ЩЖ" to 0,
            "ЩЗ" to 0,
            "ЩИ" to 6,
            "ЩЙ" to 0,
            "ЩК" to 0,
            "ЩЛ" to 0,
            "ЩМ" to 0,
            "ЩН" to 1,
            "ЩО" to 0,
            "ЩП" to 0,
            "ЩР" to 0,
            "ЩС" to 0,
            "ЩТ" to 0,
            "ЩУ" to 1,
            "ЩФ" to 0,
            "ЩХ" to 0,
            "ЩЦ" to 0,
            "ЩЧ" to 0,
            "ЩШ" to 0,
            "ЩЩ" to 0,
            "ЩЫ" to 0,
            "ЩЬ" to 0,
            "ЩЭ" to 0,
            "ЩЮ" to 0,
            "ЩЯ" to 0,
            "ЫА" to 0,
            "ЫБ" to 1,
            "ЫВ" to 9,
            "ЫГ" to 1,
            "ЫД" to 3,
            "ЫЕ" to 12,
            "ЫЖ" to 0,
            "ЫЗ" to 2,
            "ЫИ" to 4,
            "ЫЙ" to 7,
            "ЫК" to 3,
            "ЫЛ" to 6,
            "ЫМ" to 6,
            "ЫН" to 3,
            "ЫО" to 2,
            "ЫП" to 10,
            "ЫР" to 3,
            "ЫС" to 9,
            "ЫТ" to 4,
            "ЫУ" to 1,
            "ЫФ" to 0,
            "ЫХ" to 16,
            "ЫЦ" to 0,
            "ЫЧ" to 1,
            "ЫШ" to 2,
            "ЫЩ" to 0,
            "ЫЫ" to 0,
            "ЫЬ" to 0,
            "ЫЭ" to 0,
            "ЫЮ" to 0,
            "ЫЯ" to 0,
            "ЬА" to 0,
            "ЬБ" to 2,
            "ЬВ" to 4,
            "ЬГ" to 1,
            "ЬД" to 1,
            "ЬЕ" to 2,
            "ЬЖ" to 0,
            "ЬЗ" to 2,
            "ЬИ" to 2,
            "ЬЙ" to 0,
            "ЬК" to 6,
            "ЬЛ" to 0,
            "ЬМ" to 3,
            "ЬН" to 13,
            "ЬО" to 2,
            "ЬП" to 4,
            "ЬР" to 1,
            "ЬС" to 11,
            "ЬТ" to 3,
            "ЬУ" to 0,
            "ЬФ" to 0,
            "ЬХ" to 0,
            "ЬЦ" to 0,
            "ЬЧ" to 1,
            "ЬШ" to 4,
            "ЬЩ" to 0,
            "ЬЫ" to 0,
            "ЬЬ" to 0,
            "ЬЭ" to 1,
            "ЬЮ" to 3,
            "ЬЯ" to 1,
            "ЭА" to 0,
            "ЭБ" to 0,
            "ЭВ" to 1,
            "ЭГ" to 0,
            "ЭД" to 0,
            "ЭЕ" to 0,
            "ЭЖ" to 0,
            "ЭЗ" to 0,
            "ЭИ" to 0,
            "ЭЙ" to 0,
            "ЭК" to 1,
            "ЭЛ" to 0,
            "ЭМ" to 0,
            "ЭН" to 1,
            "ЭО" to 0,
            "ЭП" to 0,
            "ЭР" to 0,
            "ЭС" to 1,
            "ЭТ" to 9,
            "ЭУ" to 0,
            "ЭФ" to 0,
            "ЭХ" to 0,
            "ЭЦ" to 0,
            "ЭЧ" to 0,
            "ЭШ" to 0,
            "ЭЩ" to 0,
            "ЭЫ" to 0,
            "ЭЬ" to 0,
            "ЭЭ" to 0,
            "ЭЮ" to 0,
            "ЭЯ" to 0,
            "ЮА" to 0,
            "ЮБ" to 2,
            "ЮВ" to 1,
            "ЮГ" to 2,
            "ЮД" to 1,
            "ЮЕ" to 0,
            "ЮЖ" to 0,
            "ЮЗ" to 3,
            "ЮИ" to 1,
            "ЮЙ" to 0,
            "ЮК" to 1,
            "ЮЛ" to 0,
            "ЮМ" to 1,
            "ЮН" to 1,
            "ЮО" to 1,
            "ЮП" to 3,
            "ЮР" to 1,
            "ЮС" to 1,
            "ЮТ" to 7,
            "ЮУ" to 0,
            "ЮФ" to 0,
            "ЮХ" to 0,
            "ЮЦ" to 1,
            "ЮЧ" to 1,
            "ЮШ" to 0,
            "ЮЩ" to 4,
            "ЮЫ" to 0,
            "ЮЬ" to 0,
            "ЮЭ" to 0,
            "ЮЮ" to 0,
            "ЮЯ" to 0,
            "ЯА" to 1,
            "ЯБ" to 3,
            "ЯВ" to 9,
            "ЯГ" to 1,
            "ЯД" to 3,
            "ЯЕ" to 3,
            "ЯЖ" to 1,
            "ЯЗ" to 5,
            "ЯИ" to 3,
            "ЯЙ" to 2,
            "ЯК" to 3,
            "ЯЛ" to 3,
            "ЯМ" to 4,
            "ЯН" to 6,
            "ЯО" to 3,
            "ЯП" to 6,
            "ЯР" to 3,
            "ЯС" to 6,
            "ЯТ" to 10,
            "ЯУ" to 0,
            "ЯФ" to 0,
            "ЯХ" to 2,
            "ЯЦ" to 1,
            "ЯЧ" to 4,
            "ЯШ" to 1,
            "ЯЩ" to 1,
            "ЯЫ" to 0,
            "ЯЬ" to 0,
            "ЯЭ" to 1,
            "ЯЮ" to 1,
            "ЯЯ" to 1
    )

    var threegramm = mapOf(
        "_Б_" to 0,
        "_Г_" to 0,
        "_Д_" to 0,
        "_Е_" to 0,
        "_Ж_" to 0,
        "_З_" to 0,
        "_Л_" to 0,
        "_М_" to 0,
        "_Н_" to 0,
        "_П_" to 0,
        "_Р_" to 0,
        "_Т_" to 0,
        "_Ф_" to 0,
        "_Х_" to 0,
        "_Ц_" to 0,
        "_Ч_" to 0,
        "_Ш_" to 0,
        "_Щ_" to 0,
        "_Ы_" to 0,
        "_Ь_" to 0,
        "_Э_" to 0,
        "_Ю_" to 0
    )
        private const val PERMUTATION_SIZE: Int = 4
        fun cryptanalysisEncodedString(encodeString: String):List<DecodedString>{
            return processAnalisis(encodeString.toCharArray())
        }

        fun cryptanalysisEncodedAllString(encodeString: String):List<DecodedString>{
            return processAllAnalisis(encodeString.toCharArray())
        }
        private  fun checkExistencePermutation(k1:Int,k2:Int,k3:Int,k4:Int,k5:Int):Boolean {return  k1 != k2 && k1 != k3 && k1 != k4 && k1 != k5  && k2 != k3 && k2 != k4 && k2 != k5 && k3 != k4 && k3 != k5 && k4 != k5}
        private  fun checkExistenceStringInRussian(str: String):Boolean {
            for(i in 0..str.length-3) {
                var key: String = str.substring(i,i+3)
                if(threegramm.containsKey(key)){
                    if(threegramm[key] ==0){
                        return false
                    }
                }
            }
            for(i in 0..str.length-2) {
                var key: String = str.substring(i,i+2)
                if(bigramm.containsKey(key)){
                    if(bigramm[key]!! < 4){
                        return false
                    }
                }
            }
            return true
        }
        private  fun checkExistenceAllStringInRussian(str: String):Boolean {
            for(i in 0..str.length-3) {
                var key: String = str.substring(i,i+3)
                if(threegramm.containsKey(key)){
                    if(threegramm[key] ==0){
                        return false
                    }
                }
            }
            for(i in 0..str.length-2){
                var key: String = str.substring(i,i+2)
                if(bigramm.containsKey(key)){
                    if(bigramm[key] == 0){
                        return false
                    }
                }
            }
            return true
        }
        private fun getProbablyDecodeString(k1:Int,k2:Int,k3:Int,k4:Int,k5:Int, encodeString: CharArray):String {
            var result: String = ""
            for(i in 0..PERMUTATION_SIZE){
                result= result + encodeString[k1+ (PERMUTATION_SIZE+1)*i] + encodeString[k2+ (PERMUTATION_SIZE+1)*i]+ encodeString[k3+ (PERMUTATION_SIZE+1)*i] + encodeString[k4+ (PERMUTATION_SIZE+1)*i]+ encodeString[k5+ (PERMUTATION_SIZE+1)*i]
            }
            return result
        }

        private fun processAllAnalisis(encodeString: CharArray): List<DecodedString> {
            var result: List<DecodedString> = mutableListOf<DecodedString>()
            for (k1 in 0..PERMUTATION_SIZE){
                for (k2 in 0..PERMUTATION_SIZE){
                    for (k3 in 0..PERMUTATION_SIZE){
                        for (k4 in 0..PERMUTATION_SIZE){
                            for (k5 in 0..PERMUTATION_SIZE){
                                if(checkExistencePermutation(k1, k2, k3, k4, k5)){
                                    var str:String = getProbablyDecodeString(k1, k2, k3, k4, k5,encodeString)
                                    if(checkExistenceAllStringInRussian(str)){
                                        result+= DecodedString(listOf(k1,k2,k3,k4,k5).joinToString(","),str)
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return result.toList()
        }
        private fun processAnalisis(encodeString: CharArray): List<DecodedString>{
            var result: List<DecodedString> = mutableListOf<DecodedString>()
            for (k1 in 0..PERMUTATION_SIZE){
                for (k2 in 0..PERMUTATION_SIZE){
                    for (k3 in 0..PERMUTATION_SIZE){
                        for (k4 in 0..PERMUTATION_SIZE){
                            for (k5 in 0..PERMUTATION_SIZE){
                                if(checkExistencePermutation(k1, k2, k3, k4, k5)){
                                           var str:String = getProbablyDecodeString(k1, k2, k3, k4, k5,encodeString)
                                            if(checkExistenceStringInRussian(str)){
                                                result+= DecodedString(listOf(k1,k2,k3,k4,k5).joinToString(","),str)
                                            }
                                        }
                            }
                        }
                    }
                }
            }
            return result.toList()
        }

    }
}