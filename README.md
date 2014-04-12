EasyButton
==========

EasyButton is Custom button set background color easily.

## How to use

### Implementation

EasyButton usage is very simple.

```xml
<easybutton.EasyButton
    android:id="@+id/button"
    android:text="@string/button_text"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    <!-- custom attributes -->
    tools:color_default="@color/color_default"
    tools:color_pressed="@color/color_pressed"
    tools:color_focused="@color/color_focused" />
```

### The way that we have been

The way that we have been is trouble.

```xml
<Button
    android:id="@+id/button"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="@string/label_button"
    android:background="@drawable/flat_button_background"/>
```

```xml
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape>
            <solid android:color="@color/color_default" />
        </shape>
    </item>
    <item android:state_pressed="true">
        <shape>
            <solid android:color="@color/pressed_color" />
        </shape>
    </item>
    <item android:state_focused="true">
        <shape>
            <solid android:color="@color/focused_color" />
        </shape>
    </item>
</selector>
```

## Sample

Please try to move the [sample](https://github.com/hotchemi/EasyButton/tree/master/sample/).

## Requirements

Supports Android 2.2 or greater.

## Contribute

1. Fork it
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Commit your changes (`git commit -am 'Added some feature'`)
4. Push to the branch (`git push origin my-new-feature`)
5. Create new Pull Request

## ChangeLog

- 2014/04/13 0.0.1 release.
