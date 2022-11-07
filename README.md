任务一：

利用SimpleAdapter实现如下界面效果

实验截图



任务二：

创建如图所示的自定义对话框

• 请创建一个如图所示的布局，

• 调 用 AlertDialog.Builder 对 象 上 的 setView() 将 布 局 添 加 到 AlertDialog。

关键代码

```java
<TextView
    android:layout_width="match_parent"
    android:layout_height="100dp"
    android:layout_marginTop="50dp"
    android:background="#FFC107"
    android:paddingTop="30dp"
    android:text="ANORDIO APP"
    android:textAlignment="center"
    android:textColor="#F7F6FA"
    android:textSize="30dp"></TextView>

<EditText
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="Username"
    android:layout_marginTop="20dp"
    ></EditText>
<EditText
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="Password"
    android:layout_marginTop="20dp"
    ></EditText>
```

实验截图



任务三：

使用XML定义菜单

- 字体大小(有小，中，大这3个选项;分别 对应10号字，16号字和20号字);点击之 后设置测试文本的字体

- 普通菜单项，点击之后弹出Toast提示

- 字体颜色(有红色和黑色这2个选项)，点 击之后设置测试文本的字体

  

关键代码：

```java
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:title="字体大小"  android:id="@+id/list_view">
        <menu>
            <item android:title="10号"  android:id="@+id/list_view_vertical_stander"/>
            <item android:title="16号"  android:id="@+id/list_view_vertical_reverse"/>
            <item android:title="20号"  android:id="@+id/list_view_horizontal_stander"/>

        </menu>
    </item>
    <item android:title="普通菜单项" android:id="@+id/grid_view">

    </item>
    <item android:title="字体颜色"  android:id="@+id/stagger_view">
        <menu>
            <item android:title="红色"  android:id="@+id/stagger_view_vertical_stander"/>
            <item android:title="黑色"  android:id="@+id/stagger_view_vertical_reverse"/>

        </menu>
    </item>
</menu>
```

实验截图



任务四：

**创建上下文操作模式**(ActionMode)的上下文菜单

关键代码

```java
public void onItemCheckedStateChanged(ActionMode mode, int position, long id, boolean checked) {

    if (checked == true) {
        list.get(position).setBo(true);

        adapter.notifyDataSetChanged();
        num++;
    } else {
        list.get(position).setBo(false);
        adapter.notifyDataSetChanged();
        num--;
    }
    mode.setTitle("  " + num + " Selected");
}
@Override
public boolean onCreateActionMode(ActionMode mode, Menu menu) {
    MenuInflater inflater = mode.getMenuInflater();
    inflater.inflate(R.menu.problem04_action_mode, menu);
    num = 0;
    adapter.notifyDataSetChanged();
    return true;

}
```

实验截图